package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AllAnagramsInAList {

    public static void main(String[] args) {
        List<String> worlds = Arrays.asList("listen", "silent", "hello",
                "world", "night", "thing");

        Map<String,List<String>> map = worlds.stream().collect(Collectors.groupingBy(f -> {
            char c[] = f.toCharArray();
            Arrays.sort(c);
            return new String(c);
        }));

        System.out.println(map);
    }
}
