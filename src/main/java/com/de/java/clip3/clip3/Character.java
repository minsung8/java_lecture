package com.de.java.clip3.clip3;

public class Character {
    public static void main(String[] args){

        char a = 'a';
        System.out.println(a);

        Default d = new Default();
        System.out.println(d.charDefault);
    }

    static class Default {
        char charDefault;
    }


}
