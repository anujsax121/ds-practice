package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AllPairsOfNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        int target = 12;
        Map<Integer, Integer> map = numbers.stream()
                .filter(f -> numbers.contains(target - f))
                .collect(Collectors.toMap(f -> f, k -> (target - k), (oldKey, newKey) -> newKey));
        System.out.println(map);


    }
}
