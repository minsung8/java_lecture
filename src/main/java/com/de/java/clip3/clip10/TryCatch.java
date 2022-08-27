package com.de.java.clip3.clip10;

class ArrayCalculation{
    int[] arr = {0 , 1, 2, 3, 4};

    public int divide(int deIndex, int nuIndex){
        return arr[deIndex] / arr[nuIndex];
    }
}

public class TryCatch {

    public static void main(String[] args){

        ArrayCalculation arrayCalculation = new ArrayCalculation();

        try{
            System.out.println(arrayCalculation.divide(2, 1));
        } catch (Exception e){
            throw e;
        }
//        System.out.println(arrayCalculation.divide(2, 1));
//        System.out.println(arrayCalculation.divide(1, 0));
//        System.out.println(arrayCalculation.divide(5, 0));

    }
}
