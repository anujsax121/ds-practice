package com.practice.array;

import java.util.Arrays;

public class LeftShiftingRoratedArray {

    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5};
        leftRoratArr(n, 1);
    }

    private static void leftRoratArr(int[] n, int d) {

        int len = n.length;
        int temp[] = new int[len];
        for (int i = d; i < n.length; i++) {

            temp[i-d] = n[i];
        }
        for (int i = 0; i <d; i++) {

            temp[(i+d)+1] = n[i];
        }

        System.out.println(Arrays.toString(temp));

    }
}
