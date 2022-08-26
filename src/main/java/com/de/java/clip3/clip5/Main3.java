package com.de.java.clip3.clip5;

public class Main3 {
    static class Animal {
        String name;

        Animal(String name){
            this.name = name;
        }

        public void cry() {
            System.out.println(name + " is crying");
        }
    }
    static class Dog extends Animal {

        String breed;

        Dog(String name, String breed) {
            super(name);
            this.breed = breed;
        }

        public void swim(){
            System.out.println(name + " is swimming");
        }
    }

    static class Giraffe extends Animal {
        Giraffe(String name){
            super(name);
        }

        @Override
        public void cry() {
            System.out.println("not crying");
        }
    }


    public static void main(String[] args){
        Dog dog = new Dog("코코", "허스키");
        dog.cry();
        dog.swim();
        System.out.println(dog.breed);

        Giraffe g = new Giraffe("기린");
        g.cry();
    }
}
