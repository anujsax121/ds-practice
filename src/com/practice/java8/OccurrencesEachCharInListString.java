package com.practice.java8;

import java.util.Arrays;
import java.util.List;

public class OccurrencesEachCharInListString {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "melon");
        char target = 'a';
        Long count = strings
                .stream()
                .flatMap(f -> f.chars().boxed())
                .filter(f -> (char) f.intValue() == target)
                .count();
        System.out.println("Target Character is " + target + " occurrences are " + count);
    }
}
