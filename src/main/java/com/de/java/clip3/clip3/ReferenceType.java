package com.de.java.clip3.clip3;

import java.util.Arrays;

public class ReferenceType {
    public static void main(String[] args){

        String str = "hello";
        System.out.println(str);

        int[] intArray = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(intArray));

        int[] intEmpty = new int[5];
        System.out.println(Arrays.toString(intEmpty));

        String[] strEmpty = new String[5];
        System.out.println(Arrays.toString(strEmpty));
    }


}
