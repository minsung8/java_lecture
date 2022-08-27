package com.de.java.clip3.clip8;

public interface Bird {

    void fly(int x, int y, int z);

    default void printBreed(){
        System.out.println(getBreed());
    }

    String getBreed();

    static void staticMethod(){
        System.out.println("static method");
    }

    abstract void abstractMethod();
}
