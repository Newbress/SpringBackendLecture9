package org.example.Head02_OOP.example11;

public class BusinessUser extends User{
    private String email;
    private String CompanyName;

    public BusinessUser(String userId, String name, String email, String ComplayName) {
        super(userId, name);
        this.email = email;
        this.CompanyName = ComplayName;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("이메일: " + email);
        System.out.println("회사이름: " + CompanyName);
    }
}
