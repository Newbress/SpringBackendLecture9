package org.example.Head02_OOP.example12;

public class CryptoPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("크립토로: " + amount + "원 결제 처리.");
    }
}