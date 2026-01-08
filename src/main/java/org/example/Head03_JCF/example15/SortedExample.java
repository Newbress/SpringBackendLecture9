package org.example.Head03_JCF.example15;

import java.util.Arrays;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,1,8,2,9);
        numbers.stream()
                .sorted()
                .forEach(num -> System.out.print(num+ " "));
    }
}
