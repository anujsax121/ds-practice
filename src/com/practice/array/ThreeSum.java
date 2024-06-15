package com.practice.array;

import java.util.Arrays;

public class ThreeSum {

    public static void main(String[] args) {

        int n[] = {1, 2, 5, 0, 6, 2, 3, 4, 10, 11, 7};
        findThreeSum(n, 8);
    }

    private static void findThreeSum(int[] n, int targetSum) {
        Arrays.sort(n);
        for (int i = 0; i < n.length; i++) {

            int l = i + 1, j = n.length - 2;
            while (l <= j) {
                if (n[i] + n[l] + n[j] == targetSum) {
                    System.out.println("{" + n[i] + ", " + n[l] + ", " + n[j] + "}");
                    l++;
                    j--;
                } else if (n[i] + n[l] + n[j] < targetSum) {
                    l++;
                } else {
                    j--;
                }
            }

        }

    }


}
