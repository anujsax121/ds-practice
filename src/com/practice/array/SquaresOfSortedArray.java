package com.practice.array;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public static void main(String[] args) {
        int n[] = {-5, -2, -1, 0, 4, 6};
        sortedSquaresSimplified(n);
    }

    private static void sortedSquaresSimplified(int[] n) {
        int l = 0, j = n.length - 1;
        int len = n.length - 1;
        int temp[] = new int[n.length];
        int left = 0;
        int right = 0;
        while (l < j) {
            left = n[l] * n[l];
            right = n[j] * n[j];
            if (left > right) {
                temp[len--] = left;
                l++;
            } else if (right > left) {
                temp[len--] = right;
                j--;
            }
        }
        System.out.println(Arrays.toString(temp));
    }

}
