package org.example.Head03_JCF.example14;

import java.util.function.Function;

public class StaticMethodRefDemo {
    public static int doubleValue(int x) {
        return x * 2;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> f2 = StaticMethodRefDemo::doubleValue;

        System.out.println(f2.apply((10)));
    }
}
