package com.practice.array;

import java.util.Arrays;

public class CyclicRoratedArr {

    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5};
        rorated(n);
    }

    private static void rorated(int[] n) {

        int x = n[n.length - 1], i;
        for (i = n.length - 1; i > 0; i--)
            n[i] = n[i - 1];
            n[0] = x;
        System.out.println(Arrays.toString(n));

    }

}
