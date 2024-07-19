package com.practice.array;

import java.util.Arrays;

public class LeftShiftingRoratedArray {

    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5};
        leftRoratArr(n, 2);
    }

    private static void leftRoratArr(int[] n, int d) {

        int len = n.length;
        d = d % len;
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = n[i];
        }

        int j = 0;
        for (int i = d; i < n.length; i++) {
            n[j++] = n[i];
        }

        for (int i = d + 1; i < n.length; i++) {
            n[i] = temp[i - (len - d)];
        }

        System.out.println(Arrays.toString(n));

    }
}
