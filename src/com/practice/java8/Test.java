package com.practice.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String str = "this is a levis engineering interview";


        Map<Character, Integer> map = new TreeMap<>();
        char ch [] = str.toCharArray();
        for (char c : ch) {
            if (Character.isAlphabetic(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println(map);

       map = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry ::getKey, Map.Entry ::getValue, (oldKey, newKey) -> newKey, LinkedHashMap ::new));

        System.out.println(map);

    }

}
