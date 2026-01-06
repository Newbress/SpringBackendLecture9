package org.example.Head02_OOP.example09;

public class PersonalUser extends User {
    private String personalEmail;

    public PersonalUser(String userId, String name, String personalEmail) {
        super(userId, name); // 부모 생성자 호출
        this.personalEmail = personalEmail;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("개인 이메일: " + personalEmail);
    }
}
