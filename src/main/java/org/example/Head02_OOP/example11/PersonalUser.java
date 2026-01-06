package org.example.Head02_OOP.example11;

public class PersonalUser extends User{
    private String email;

    public PersonalUser(String userId, String name, String email) {
        super(userId, name);
        this.email = email;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("이메일: " + email);
    }

}
