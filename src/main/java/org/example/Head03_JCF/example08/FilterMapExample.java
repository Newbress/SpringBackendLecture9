package org.example.Head03_JCF.example08;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class FilterMapExample {
    public static void main(String[] args) {
        Map<String, Integer> score = new HashMap<>();
        score.put("Kim", 90);
        score.put("Lee", 75);
        score.put("Park", 80);

        Predicate<Map.Entry<String, Integer>> highScore = new Predicate<Map.Entry<String, Integer>>(){
            @Override
            public boolean test(Map.Entry<String, Integer> entry) {
                return entry.getValue() >= 80;
            }
        };

        score.entrySet().stream()
                .filter(highScore)
                .forEach(entry -> System.out.println("High Score: " + entry.getKey() + " => " + entry.getValue()));
    }
}
