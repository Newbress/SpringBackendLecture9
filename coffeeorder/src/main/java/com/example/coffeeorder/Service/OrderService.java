package com.example.coffeeorder.Service;


import com.example.coffeeorder.DTO.OrderCoffeeRequest;
import com.example.coffeeorder.DTO.OrderCreateRequest;
import com.example.coffeeorder.DTO.OrderResponse;
import com.example.coffeeorder.Domain.Coffee;
import com.example.coffeeorder.Domain.Member;
import com.example.coffeeorder.Domain.Order;
import com.example.coffeeorder.Domain.Stamp;
import com.example.coffeeorder.Repository.CoffeeRepository;
import com.example.coffeeorder.Repository.MemberRepository;
import com.example.coffeeorder.Repository.OrderRepository;
import com.example.coffeeorder.Repository.StampRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderService {
  private final OrderRepository orderRepository;
  private final MemberRepository memberRepository;
  private final StampRepository stampRepository;
  private final CoffeeRepository coffeeRepository;

//  @Transactional
//  public OrderResponse creatOrder(OrderCreateRequest request){
//    Member member = memberRepository.findById(request.merberId())
//        .orElseThrow(()-> new IllegalArgumentException("회원 없음"));
//
//    Stamp stamp = stampRepository.findByMemberId(member.getId())
//        .orElseThrow(()-> new IllegalArgumentException("스탬프 없음"));
//
//    Order order = new Order(member);
//    int totalQty = 0;
//
//    for(OrderCoffeeRequest ocReq : request.orderCoffees()) {
//
//    }
//  }
}
