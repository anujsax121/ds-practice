package com.practice.array;

import java.util.Arrays;

public class RightShiftRoratedArray {

    public static void main(String[] args) {
        int n[] = {1, 3, 5, 7, 9};
        int k = 2;
        rightRotatedKTimes(n, k);
    }

    private static void rightRotatedKTimes(int[] n, int k) {


        int len = n.length;
        if(len == k) {
            System.out.println(Arrays.toString(n));
            return;
        }
        int temp[] = new int[len];
        for (int i = 0; i < n.length; i++) {
            temp[(len +k+i)%len] = n[i];
        }
        System.out.println(Arrays.toString(temp));

    }
}
