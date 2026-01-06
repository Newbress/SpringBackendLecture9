package org.example.Head02_OOP.example08;

public class CryptoAbstractPayment implements AbstractPayment {
    @Override
    public void pay(double amount) {
        System.out.println("크립토로 " + amount + "원 결제 완료.");
    }

    @Override
    public void cancel(double amount) {
        System.out.println("크립토로 " + amount + "원 취소 완료.");
    }
}
