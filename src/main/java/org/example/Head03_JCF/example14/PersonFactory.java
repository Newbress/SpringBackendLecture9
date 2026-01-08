package org.example.Head03_JCF.example14;

@FunctionalInterface
interface PersonFactory {
    Person create(String name , int age);
}

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


}