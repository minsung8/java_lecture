package com.de.java.clip3.clip5;

public class Main {
    static class Person {
        String name;
        String nation;
        int age;

        Person(String name, String nation, int age){
            this.name = name;
            this.nation = nation;
            this.age = age;
        }
    }



    public static void main(String[] args){
        Person p1 = new Person("p1", "p1", 1);
        Person p2 = new Person("p2", "p2", 2);

        Person[] persons = {p1, p2};

        for (Person p : persons){
            System.out.println(p.name);
        }
    }
}
