package com.practice.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange",
                "grape", "kiwi");
        String longestStr = list
                .stream()
                .max(Comparator.comparing(String::length)).orElse("");
        System.out.println(longestStr);

    }
}
