package com.practice.array;

import java.util.Arrays;

public class SeparateZeroAndOne {

    public static void main(String[] args) {
        int n[] = {1, 0, 1, 0, 0, 1, 0};
        seprateNumber(n);
    }

    private static void seprateNumber(int[] n) {

        int temp = 0, j = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == 0) {
                temp = n[i];
                n[i] = n[j];
                n[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(n));

    }
}
