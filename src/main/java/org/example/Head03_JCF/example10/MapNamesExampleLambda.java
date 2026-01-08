package org.example.Head03_JCF.example10;

import java.util.Arrays;
import java.util.List;

public class MapNamesExampleLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
                .map(s -> s.length())
                .forEach(length -> System.out.println("Name length: " + length));
    }
}
