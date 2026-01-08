package org.example.Head03_JCF.example14;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        PersonFactory factory2 = Person::new;


        Person p = factory2.create("Kim", 25);
        System.out.println("Create Person ->: " + p.name + ", age: " + p.age);
    }

}
