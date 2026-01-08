package org.example.Head03_JCF.example12;

import java.util.HashMap;
import java.util.Map;

public class ForEachMapExampleLambda {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park", 92);

        scores.entrySet().stream()
                .forEach(e -> System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue()));
    }
}
