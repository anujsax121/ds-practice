package com.practice.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8_FilterMap {

    public static void main(String[] args) {

        Map<Integer, String> mobiles = new HashMap<>();
        mobiles.put(1, "iPhone 7");
        mobiles.put(2, "iPhone 6S");
        mobiles.put(3, "Samsung");
        mobiles.put(4, "1+");

        mobiles = mobiles.entrySet().stream().filter(f -> "Samsung".equals(f.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(mobiles);


    }
}
