package org.example.Head02_OOP.example16;

public class LspTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setWidth(5);
        rect.setHeight(10);

        System.out.println("Rectangle area: " + rect.getArea());

        Rectangle square = new Square();
        square.setWidth(5);
        square.setHeight(10);

        System.out.println("Square area: " + square.getArea());
    }
}
