package org.example.Head02_OOP.example03;

public class Order {
    private String orderId;
    private boolean isPaid;
    private String name;

    public Order() {
        this.orderId = "NONE";
        this.isPaid = false;
    }
    public Order(String orderID, boolean isPaid) {
        this.orderId = orderID;
        this.isPaid = isPaid;
    }
    public String getOrderId() {
        return this.orderId;
    }
    public boolean getIsPaid() {
        return this.isPaid;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
}
