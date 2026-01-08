package org.example.Head03_JCF.example15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectSquareEvenExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,4,5,10,2);

        List<Integer> processed = numbers.stream()
                .filter(n -> n % 2 ==0)
                .map(n-> n * n)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Processed list: " + processed);

    }
}
