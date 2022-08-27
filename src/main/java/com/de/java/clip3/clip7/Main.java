package com.de.java.clip3.clip7;

public abstract class Main {
    private int x, y, z;

    void fly(int x, int y, int z){
        System.out.println("move");
        this.x = x;
        this.y = y;

        if (flyable(z)){
            this.z = z;
        } else{
            System.out.println("dont fly");
        }

        printLocation();
    }

    public void printLocation(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    abstract boolean flyable(int z);
}
