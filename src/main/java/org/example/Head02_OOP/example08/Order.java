package org.example.Head02_OOP.example08;

public class Order {
    private AbstractPayment abstractPayment;

    public Order(AbstractPayment abstractPayment) {
        this.abstractPayment = abstractPayment;
    }

    public void process(double amount) {
        abstractPayment.pay(amount);
    }
    public void cancel(double amount) {
        abstractPayment.cancel(amount);
    }
}
