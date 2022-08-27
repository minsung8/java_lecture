package com.de.java.clip3.clip9;

public abstract class Person {
    String name;
    int age;
    int x;
    int y;
    int v;

    void walk(int x, int y){
        System.out.println("walk start");
        this.x = x;
        this.y = y;
        System.out.println(x);
        System.out.println(y);
    }

    abstract boolean runable(int x, int y);
    abstract boolean swimable(int x, int y);

}

