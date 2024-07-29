package com.practice.array;

import java.util.HashMap;
import java.util.Map;

public class SubArrayGivenTargetSum {

    public static void main(String[] args) {
        int n[] = {2,3,5};
        int targetSum = 5;
        subArrayTargetSum(n, targetSum);
    }

    private static void subArrayTargetSum(int[] n, int targetSum) {

    }

    private static void printIndex(int[] n, int i, int j) {
        for(i=0;i<=j;i++) {
            System.out.println(n[i]);
        }
    }
}
