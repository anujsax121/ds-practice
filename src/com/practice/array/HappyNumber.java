package com.practice.array;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        int n = 13;
        boolean flag = isHappyNumber(n);
        System.out.println(flag);
    }

    private static boolean isHappyNumber(int n) {

        Set<Integer> set = new HashSet<>();
        while (set.add(n)) {
            int value = 0;
            while (n > 0) {
                value = value + (int) Math.pow(n%10, 2);
                n = n / 10;
            }
            n = value;
        }
        return n == 1;

    }
}
