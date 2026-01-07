package org.example.Head02_OOP.example27;

public class PaymentMethodDemo {
    public static void main(String[] args) {
        for(PaymentMethod method : PaymentMethod.values()) {
            System.out.println(method.name() + " => " + method.getDisplayName());
        }
    }
}
