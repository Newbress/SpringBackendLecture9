package org.example.Head02_OOP.example14;

public class UserAccount {
    private final String accountId;
    private double balance;

    public UserAccount(String accountId) {
        if (accountId == null || accountId.isBlank()){
            throw new IllegalArgumentException("계좌 ID는 필수입니다.");
        }
        this.accountId = accountId;
        this.balance = balance;
    }
    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("0보다 커야합니다.");
        }
        balance += amount;
    }
    public void withdraw(double amount) {
        if(amount <= 0 ) {
            throw new IllegalArgumentException("출금 오류");
        }
        if(balance < amount){
            balance -= amount;
        }
    }
}
