package org.example.Head03_JCF.example15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 20));
        people.add(new Person("Daivid", 40));

        System.out.println("=== 정렬 전 (원본 리스트) ===");
        System.out.println(people);

        List<Person> sortedByAge = people.stream()
                .sorted(new PersonAgeComparator())
                .collect(Collectors.toList());
        System.out.println("=== 나이 기준 오름차순 정련 (Stream + PersonAgeComparator ===");
        System.out.println(sortedByAge);
    }
}
