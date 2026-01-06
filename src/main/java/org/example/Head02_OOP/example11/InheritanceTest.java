package org.example.Head02_OOP.example11;

public class InheritanceTest {
    public static void main(String[] args) {
        User u = new PersonalUser("U001", "Alice", "Alice@example.com");
        u.printUserInfo();

        User b = new BusinessUser("U002", "company", "company@email.com", "com");
        b.printUserInfo();
    }
}
