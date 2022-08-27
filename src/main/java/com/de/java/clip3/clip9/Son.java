package com.de.java.clip3.clip9;

public class Son extends Person{

    static int v = 5;

    @Override
    boolean runable(int x, int y) {
        System.out.println("runable");
        this.x = x;
        this.y = y;
        this.v += 2;
        System.out.println(x);
        System.out.println(y);
        System.out.println(v);
        return true;
    }

    @Override
    boolean swimable(int x, int y) {
        System.out.println("swimable");
        this.x = x;
        this.y = y;
        this.v += 1;
        System.out.println(x);
        System.out.println(y);
        System.out.println(v);
        return true;
    }
}
