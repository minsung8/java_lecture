package com.de.java.clip3.clip5;

public class Main2 {
    static class Calculattion {
        int add(int x, int y){
            return x + y;
        }

        static int add2(int x, int y){
            return x + y;
        }
    }
    public static void main(String[] args){
        Calculattion cal = new Calculattion();
        System.out.println(cal.add(5, 6));
        System.out.println(Calculattion.add2(5, 6));

    }
}
