package com.de.java.clip3.clip11;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args){
        String[] arr = {"a", "b", "c", "d", "e"};

        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(param -> System.out.print(param + " ")

        );

        System.out.println();

    }
}
