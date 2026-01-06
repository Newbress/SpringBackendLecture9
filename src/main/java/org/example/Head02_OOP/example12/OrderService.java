package org.example.Head02_OOP.example12;

public class OrderService {
    public void processPayment(Payment method, double amount) {
        method.pay(amount);
    }
}
