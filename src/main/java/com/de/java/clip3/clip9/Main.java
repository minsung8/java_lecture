package com.de.java.clip3.clip9;

public class Main {
    public static void main(String[] args){
        Person son = new Son();
        son.name = "son";
        son.age = 10;
        son.v = 5;

        Person parents = new Parents();
        parents.name = "parents";
        parents.age = 20;
        parents.v = 3;

        Person grand = new GrandParents();
        grand.name = "grand";
        grand.age = 30;
        grand.v = 1;

        System.out.println(son.x + "," + son.y + "/ name : " + son.name + ", age : " + son.age + ", v : " + son.v);
        System.out.println(parents.x + "," + parents.y + "/ name : " + parents.name + ", age : " + parents.age + ", v : " + parents.v);
        System.out.println(grand.x + "," + grand.y + "/ name : " + grand.name + ", age : " + grand.age + ", v : " + grand.v);

        if (son.runable(1, 2)){

        }

    }
}
