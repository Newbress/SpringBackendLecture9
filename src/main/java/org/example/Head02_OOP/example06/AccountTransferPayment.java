package org.example.Head02_OOP.example06;

public class AccountTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        // 계좌이체 결제에 필요한 로직
        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
    }
}