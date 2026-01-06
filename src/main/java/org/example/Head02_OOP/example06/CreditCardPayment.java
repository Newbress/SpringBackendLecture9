package org.example.Head02_OOP.example06;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        // 신용카드 결제에 필요한 로직
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }
}
