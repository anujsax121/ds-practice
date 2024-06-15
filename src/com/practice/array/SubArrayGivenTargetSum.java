package com.practice.array;

import java.util.HashMap;
import java.util.Map;

public class SubArrayGivenTargetSum {

    public static void main(String[] args) {
        int n[] = {1, 5, 4, 9, 0, 1, 7, 2, 89, 11};
        int targetSum = 10;
        subArrayTargetSum(n, targetSum);
    }

    private static void subArrayTargetSum(int[] n, int targetSum) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        int sum =0;
        for (int i = 0; i < n.length; i++) {
            sum = sum +n[i];
           if(map.containsKey(sum-targetSum)) {
               printIndex(n, map.get(sum-targetSum)+1,i);
           }
           map.put(sum,i);

        }
    }

    private static void printIndex(int[] n, int i, int j) {
        for(i=0;i<=j;i++) {
            System.out.println(n[i]);
        }
    }
}
