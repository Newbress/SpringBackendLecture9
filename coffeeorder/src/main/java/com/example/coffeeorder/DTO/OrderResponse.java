package com.example.coffeeorder.DTO;

import java.util.List;

public record OrderResponse(
    Long orderId,
    Long memberId,
    List<OrderCoffeeRequest> coffees
) {

}
