package org.example.Head03_JCF.example15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedCustomExample {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Seoul", "Busan", "New York", "London");

        cities.stream()
                .sorted(Comparator.comparing(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .forEach(city-> System.out.println("Sorted city: " + city));
    }
}
