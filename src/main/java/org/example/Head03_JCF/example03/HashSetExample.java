package org.example.Head03_JCF.example03;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        countries.add("Korea");
        countries.add("Japan");
        countries.add("China");
        countries.add("Korea");

        System.out.println("After add: " + countries);
        System.out.println("Contains 'Japan ? " + countries.contains("Japan"));

        countries.remove("China");
        System.out.println("After remove 'China': " + countries);

        System.out.println("Set Size: " + countries.size());

        countries.clear();
        System.out.println("After clear: " + countries);
    }
}
