package com.example.springdatajpa.repository;


import com.example.springdatajpa.domain.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface MenuRepository extends JpaRepository<Menu, Long> {

  List<Menu> findByNameContaining(String keyword);

  List<Menu> findByPriceBetween(int min, int max);

  boolean existsByPriceGreaterThan(int price);

  Page<Menu> findByCategoryNameAndPriceGreaterThanEqual(String categoryName, int minPrice, Pageable pageable);

  Slice<Menu> findSliceByCategoryNameAndPriceGreaterThanEqual(String categoryName, int minPrice, Pageable pageable);

  List<Menu> findByCategoryId(Long categoryId);


  @Query("""
    SELECT m
    FROM Menu m
    WHERE m.category.name = :categoryName
    AND m.price >= :minPrice
    ORDER BY m.price DESC
    """)
  List<Menu> findByCategoryNameAndMinPrice(
      @Param("categoryName") String categoryName,
      @Param("minPrice") int minPrice
  );

  List<Menu> findByCategoryName(String categoryName);

  @Modifying(clearAutomatically = true, flushAutomatically = true)
  @Query("update Menu m set m.price = :price where m.id = :id")
  int updatePrice(@Param("id") Long id, @Param("price") int price);
}