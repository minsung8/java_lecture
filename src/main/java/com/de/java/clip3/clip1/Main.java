package com.de.java.clip3.clip1;

public class Main  {
    public static void main(String[] args){
        System.out.println("start");

        InnerClass innerClass = new InnerClass();
        innerClass.printName();

    }

    public static class InnerClass {
        public void printName(){
            System.out.println(this.getClass().getName());
            System.out.println(this.getClass().getSimpleName());
        }
    }
}
