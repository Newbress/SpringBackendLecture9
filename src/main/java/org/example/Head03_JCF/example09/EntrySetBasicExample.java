package org.example.Head03_JCF.example09;

import java.util.HashMap;
import java.util.Map;

public class EntrySetBasicExample {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Korea", "Seoul");
        capitals.put("Japan", "Tokyo");
        capitals.put("USA", "Washton D.C.");

        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", capital: " + entry.getValue());
        }
    }
}
