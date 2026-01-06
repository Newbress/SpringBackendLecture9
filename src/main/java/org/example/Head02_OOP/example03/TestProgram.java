package org.example.Head02_OOP.example03;

public class TestProgram {
    public static void main(String[] args) {
        Order order = new Order();
        //Order order = new Order("1212", true);
        //Order order = new Order("문자열", "강현홍");

        System.out.println(order.getOrderId());
        System.out.println(order.getIsPaid());

        order.setOrderId("김김김");
        order.setIsPaid(false);

        System.out.println(order.getOrderId());
        System.out.println(order.getIsPaid());
    }
}
