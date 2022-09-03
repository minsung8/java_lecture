package com.de.java.clip3.clip11;


import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main3 {

    static class Sale {

        public Sale(String f_name, int price, float discount){
            this.f_name = f_name;
            this.price = price;
            this.discount = discount;
        }

        String f_name;
        int price;
        float discount;
    }

    public static void main(String[] args){
        List<Sale> saleList = Arrays.asList(
                new Sale("A", 5000, 0.05f),
                new Sale("B", 3000, 0.1f),
                new Sale("C", 4000, 0.2f),
                new Sale("D", 2000, 0.f)
        );
        Stream<Sale> saleStream = saleList.stream();
        saleStream.map(sale -> Pair.of(sale.f_name, sale.price * (1 - sale.discount) ))
                .forEach(pair -> System.out.println(pair.getLeft() + " 실 구매가 " + pair.getRight()));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int res = list.stream()
                .reduce(0, Integer::sum);
        System.out.println(res);

        List<String> list2 = Arrays.asList("a", "b", "c", "a");
        Long res2 = list2.stream()
                .filter(str -> str.startsWith("a"))
                .count();

        System.out.println(res2);

    }
}
