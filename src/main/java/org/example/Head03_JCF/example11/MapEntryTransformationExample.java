package org.example.Head03_JCF.example11;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapEntryTransformationExample {
    public static void main(String[] args) {
        Map<String, String> scores = new HashMap<>();
        scores.put("Kim", "김홍학");
        scores.put("Lee", "이이이");
        scores.put("Park", "박박박");

        Function<Map.Entry<String, String>, String> entryToString =
                new Function<Map.Entry<String, String>, String>() {
            @Override
            public String apply(Map.Entry<String, String> e) {
                return e.getKey() + ": " + e.getValue();
            }
        };

        scores.entrySet().stream()
                .map(entryToString)
                .forEach(result -> System.out.println("Student Info: " + result));
    }
}
