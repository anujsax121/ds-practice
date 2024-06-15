package com.practice.array;

import java.util.Arrays;

public class SmallestDifference {

    public static void main(String[] args) {
        int[] a1 = new int[]{1, 3, 15, 11, 2};
        int[] a2 = new int[]{23, 127, 235, 19, 8};
        int[] pair = findSmallestDifferencePair(a1, a2);
        System.out.println(pair[0] + ", " + pair[1]);
    }

    private static int[] findSmallestDifferencePair(int[] a1, int[] a2) {
        int n[] = new int[2];
        Arrays.sort(a1);
        Arrays.sort(a2);
        int l = 0, j = 0;
        int smallestElement = Integer.MAX_VALUE;
        while (l < a1.length && j < a2.length) {
            int currentDiff = Math.abs(a1[l] - a2[j]);
            if (currentDiff < smallestElement) {
                smallestElement = currentDiff;
                n[0] = a1[l];
                n[1] = a2[j];
            }
            if (a1[l] < a2[j]) {
                l++;
            } else {
                j++;
            }

        }
        return n;
    }
}
