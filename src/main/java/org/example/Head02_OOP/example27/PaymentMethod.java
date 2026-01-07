package org.example.Head02_OOP.example27;

public enum PaymentMethod {
    CREDIT_CARD("신용카드"),
    ACCOUNT_TRANSFER("계좌이체"),
    MOBILE_PAYMENT("모바일결제");

    private String displayName;

    PaymentMethod(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

