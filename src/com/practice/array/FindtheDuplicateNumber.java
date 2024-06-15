package com.practice.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        int n[] = {1, 3, 4, 2, 2, 5};
        Set<Integer> set = new HashSet<>();
        int x = Arrays.stream(n).boxed().filter(f -> !set.add(f)).findFirst().get();
        System.out.println(x);
    }
}
