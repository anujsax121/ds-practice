package com.practice.java8;

import java.util.Arrays;
import java.util.List;

public class MinAndMaxValues {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        int max = list.stream().max(Integer::compareTo).get();
        int min = list.stream().min(Integer::compareTo).get();
        System.out.println(max);
        System.out.println(min);
    }
}
