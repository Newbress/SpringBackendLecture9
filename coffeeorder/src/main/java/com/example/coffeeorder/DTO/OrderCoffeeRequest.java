package com.example.coffeeorder.DTO;

public record OrderCoffeeRequest(
    Long coffeeId,
    int quantity
) {

}
