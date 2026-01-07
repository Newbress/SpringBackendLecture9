package org.example.Head02_OOP.example24;

public class EnumBasicTest {
    public enum Level {
        LOW, MEIDIUM, HIGH
    }

    public static void main(String[] args) {
        for(Level lvl : Level.values()) {
            System.out.println(lvl + "ordinal = " + lvl.ordinal());
        }
        Level today = Level.MEIDIUM;
        System.out.println("name(): " + today.name());
    }
}
