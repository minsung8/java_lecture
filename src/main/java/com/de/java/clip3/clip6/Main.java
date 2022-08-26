package com.de.java.clip3.clip6;

public class Main {

    private void messageInside(){
        System.out.println("private");
    }

    void messageDefault(){
        messageInside();
        System.out.println("Default");
    }

    protected void messageProtected(){
        messageInside();
        System.out.println("protected");
    }

    public void messagePublic(){
        messageInside();
        System.out.println("public");
    }


}
