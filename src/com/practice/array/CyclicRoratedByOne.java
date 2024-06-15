package com.practice.array;

import java.util.Arrays;

public class CyclicRoratedByOne {

    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5};
        roratedCyclicByOne(n, 1);
    }

    private static void roratedCyclicByOne(int[] n, int d) {


        for (int i = 1; i <= d; i++) {
            int first = n[0];
            for (int j = 0; j < n.length - 1; j++) {

                n[j] = n[j + 1];
            }
            n[n.length - 1] = first;
        }

        System.out.println(Arrays.toString(n));


    }
}
