package com.practice.array;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public static void main(String[] args) {
        int n[] = {-5, -2, -1, 0, 4, 6};
        sortedSquaresSimplified(n);
    }

    private static void sortedSquaresSimplified(int[] n) {
        int l = 0, j = n.length-1;
        int left = 0;
        int right = 0;
        int highestSquareIdx = n.length-1;
        int[] squaredArr = new int[n.length];
        while (l <= j) {
            left = n[l] * n[l];
            right = n[j] * n[j];
            if (left > right) {
                squaredArr[highestSquareIdx--] = left;
                l++;
            } else  {
                squaredArr[highestSquareIdx--] = right;
                j--;
            }
        }
        System.out.println(Arrays.toString(squaredArr));
    }

}
