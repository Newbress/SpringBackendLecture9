package com.example.springdatajpa.service;

import com.example.springdatajpa.domain.Category;
import com.example.springdatajpa.domain.Menu;
import com.example.springdatajpa.dto.MenuResponse;
import com.example.springdatajpa.repository.CategoryRepository;
import com.example.springdatajpa.repository.MenuRepository;
import jakarta.persistence.EntityManager;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;


@Slf4j
@Service
@RequiredArgsConstructor
public class MenuService {
  private final MenuRepository repository;
  private final CategoryRepository categoryRepository;
  private final AuditService auditService;
  private final EntityManager em;

  @Transactional(readOnly = true)
  public MenuResponse findById(Long id) {
    Menu menu = repository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("메뉴 없음"));

    return new MenuResponse(
        menu.getId(),
        menu.getName(),
        menu.getPrice(),
        menu.getCategory().getName()
    );
  }

  @Transactional(readOnly = true)
  public List<MenuResponse> search(String keyword) {
    return repository.findByNameContaining(keyword).stream()
        .map(m -> new MenuResponse(m.getId(), m.getName(), m.getPrice(), m.getCategory().getName()))
        .toList();
  }

  @Transactional(readOnly = true)
  public List<MenuResponse> findByCategory(Long categoryId) {
    return repository.findByCategoryId(categoryId).stream()
        .map(m -> new MenuResponse(m.getId(), m.getName(), m.getPrice(), m.getCategory().getName()))
        .toList();
  }

  @Transactional(readOnly = true)
  public List<MenuResponse> findExpensiveMenusInCategory(String categoryName, int minPrice) {
    return repository.findByCategoryNameAndMinPrice(categoryName, minPrice).stream()
        .map(m -> new MenuResponse(m.getId(), m.getName(), m.getPrice(), m.getCategory().getName()))
        .toList();
  }

  @Transactional(readOnly = true)
  public Page<MenuResponse> findMenusPageByCategoryAndMinPrice(
      String categoryName,
      int minPrice,
      int page,
      int size,
      String sortBy,
      String direction
  ) {
    Sort.Direction dir = "desc".equalsIgnoreCase(direction) ? Sort.Direction.DESC : Sort.Direction.ASC;
    Pageable pageable = PageRequest.of(page, size, Sort.by(dir, sortBy));

    return repository.findByCategoryNameAndPriceGreaterThanEqual(categoryName, minPrice, pageable)
        .map(m -> new MenuResponse(m.getId(), m.getName(), m.getPrice(), m.getCategory().getName()));
  }

  @Transactional(readOnly = true)
  public Page<MenuResponse> findMenusPageByCategoryAndMinPrice(
      String categoryName,
      int minPrice,
      Pageable pageable
  ) {
    return repository.findByCategoryNameAndPriceGreaterThanEqual(categoryName, minPrice, pageable)
        .map(m -> new MenuResponse(m.getId(), m.getName(), m.getPrice(), m.getCategory().getName()));
  }


  @Transactional(readOnly = true)
  public Slice<MenuResponse> findMenusSliceByCategoryAndMinPrice(
      String categoryName,
      int minPrice,
      Pageable pageable
  ) {
    return repository.findSliceByCategoryNameAndPriceGreaterThanEqual(categoryName, minPrice, pageable)
        .map(m -> new MenuResponse(m.getId(), m.getName(), m.getPrice(), m.getCategory().getName()));
  }

  @Transactional
  public void txIncrease(String categoryName, int delta) {
    List<Menu> menus = repository.findByCategoryName(categoryName);
    menus.forEach(m-> m.increasePrice(delta));
  }

  @Transactional
  public void txCreateAndIncreaseWithRollback(
      String categoryName,
      String newMenuName,
      int newMenuPrice,
      int delta
  ) {
    Category category = categoryRepository.findByName(categoryName)
        .orElseThrow(()-> new IllegalArgumentException("카테고리 없음"));
    repository.save(new Menu(newMenuName, newMenuPrice, category));
    List<Menu> menus = repository.findByCategoryName(categoryName);
    menus.forEach(m-> m.increasePrice(delta));
    throw new RuntimeException("강제 예외(롤백 확인)");
  }
  @Transactional
  public void changePriceWithAuditAndFail(Long menuId, int newPrice) {
    log.info("[Outer] tx active={}", TransactionSynchronizationManager.isActualTransactionActive());

    TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronization() {
      @Override public void afterCompletion(int status) {
        log.info("[Outer] END = {}", status == STATUS_COMMITTED ? "COMMIT" : "ROLLBACK");
      }
    });

    // 1) 바깥 트랜잭션에서 가격 변경
    repository.updatePrice(menuId, newPrice);

    // 2) 감사 기록(항상 새 트랜잭션)
    auditService.writeAuditMenu(1L);

    // 3) 일부러 실패시켜 바깥 트랜잭션 롤백 유도
    throw new RuntimeException("OUTER FAIL");
  }

  @Transactional(isolation = Isolation.READ_COMMITTED)
  public int readTwicePrice(Long menuId) throws Exception {
    int first = repository.findById(menuId).orElseThrow().getPrice();
    Thread.sleep(5000); // 5초 동안 다른 요청으로 가격 변경(커밋)하도록 시간 벌기
    em.clear(); // ⭐ 1차 캐시 제거 -> 다음 조회는 DB로 감
    int second = repository.findById(menuId).orElseThrow().getPrice();
    return second - first; // 0이면 동일, 값이 다르면 non-repeatable read 상황 체감
  }

  @Transactional
  public void updatePrice(Long menuId, int price) {
    repository.updatePrice(menuId, price);
  }
}
