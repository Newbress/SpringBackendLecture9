package com.example.coffeeorder.DTO;

public record OrderCoffeeResponse(
    Long coffeeId,
    String coffeeName,
    int price,
    int quantity
) {

}
