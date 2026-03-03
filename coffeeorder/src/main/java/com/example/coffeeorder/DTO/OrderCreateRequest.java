package com.example.coffeeorder.DTO;

import java.util.List;

public record OrderCreateRequest(
    Long merberId,
    List<OrderCoffeeRequest> orderCoffees
) {


}
