package com.practice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsFromTwoList {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
        list1.stream().filter(f -> list2.contains(f)).forEach(System.out::println);
    }
}
