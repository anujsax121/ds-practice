package com.practice.stack;

import java.util.Arrays;

public class RainTrapping {

    public static void main(String[] args) {
        int n[] = {3, 0, 0, 2, 0, 4};
        int total = totalTrappedWater(n);
        System.out.println(total);
    }

    private static int totalTrappedWater(int[] n) {

        int leftMaxArr[] = new int[n.length];
        int rightMaxArr[] = new int[n.length];
        int minArr[] = new int[n.length];
        int leftMax = n[0];
        int rightMax = n[n.length - 1];
        leftMaxArr[0] = n[0];
        rightMaxArr[n.length - 1] = n[n.length - 1];
        for (int i = 1; i < n.length; i++) {
            leftMaxArr[i] = Math.max(leftMax, n[i]);
        }
        for (int i = n.length - 1; i > 0; i--) {
            rightMaxArr[i - 1] = Math.max(rightMax, n[i]);
        }
        int total = 0;
        for (int i = 0; i < n.length; i++) {
            total = total + Math.abs(Math.min(leftMaxArr[i], rightMaxArr[i]) - n[i]) ;
        }

        return total;
    }

}
