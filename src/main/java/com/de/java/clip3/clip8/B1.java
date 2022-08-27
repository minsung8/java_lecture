package com.de.java.clip3.clip8;

public class B1 implements Bird{

    int x, y, z;

    @Override
    public void fly(int x, int y, int z) {
        System.out.println("move start");

        this.x = x;
        this.y = y;
        this.z = z;
        printLocation();
    }

    @Override
    public String getBreed() {
        return "B1";
    }

    @Override
    public void abstractMethod() {
        System.out.println("abstact method");
    }

    public void printLocation(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
