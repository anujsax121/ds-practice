package com.practice.array;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int n[] = {1, 5, 9, 2, 7, 6};
        int targetSum = 8;
        twoSumPair(n, targetSum);
    }

    private static void twoSumPair(int[] n, int targetSum) {
        Arrays.sort(n);
        int l = 0, j = n.length - 1;
        while (l <= j) {
            if (n[l] + n[j] == targetSum) {
                System.out.println(n[l] + " ," + n[j]);
                l++;
                j--;
            } else if (n[l] + n[j] < targetSum) {
                l++;
            } else {
                j--;
            }
        }
    }
}
