package com.de.java.clip3.clip9;

public class GrandParents extends Person{

    static int v = 1;

    @Override
    boolean runable(int x, int y) {
        System.out.println("unrunable");
        return false;
    }

    @Override
    boolean swimable(int x, int y) {
        System.out.println("not swim");
        return false;
    }
}
