package com.de.java.clip3.clip11;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("b");

        System.out.println(list);

        List<String> res = list.stream()
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(res);
        System.out.println(list);

        List<String> res2 = list.stream()
                .filter("a"::equals)
                .collect(Collectors.toList());

        System.out.println(res2);

    }

}
