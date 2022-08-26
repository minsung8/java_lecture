package com.de.java.clip3.clip4;

public class Quiz {
    public static void main(String[] args){
        int n = 0;
        int m = 0;

        for (int i=1; i<=30; i++){
            if (i % 2 == 0) {
                n += i;
            } else {
                m += i;
            }
        }

        System.out.println(n);
        System.out.println(m);

    }
}
