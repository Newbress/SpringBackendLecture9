package org.example.Head02_OOP.example08;

public class Topic03ExampleMain {
    public static void main(String[] args) {
        Order o1 = new Order(new CreditCardAbstractPayment());
        o1.process(50000);
        o1.cancel(50000);

        Order o2 = new Order(new AccountTransferAbstractPayment());
        o2.process(30000);
        o2.cancel(30000);

        Order o3 = new Order(new CryptoAbstractPayment());
        o3.process(60000);
        o3.cancel(60000);
    }
}