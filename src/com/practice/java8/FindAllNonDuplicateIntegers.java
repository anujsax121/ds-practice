package com.practice.java8;

/* Given a list of integers, find all non duplicate integers using Java streams:*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllNonDuplicateIntegers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 4, 7, 8, 9, 9);
        List<Integer> numbers1 = numbers.stream()
                .filter(f -> numbers.indexOf(f) == numbers.lastIndexOf(f))
                .collect(Collectors.toList());
        System.out.println(numbers1);
    }
}
