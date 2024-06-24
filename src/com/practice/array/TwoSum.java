package com.practice.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSum {

    public static void main(String[] args) {
        int n[] = {2,7,11,15};
        int targetSum = 9;
        //twoSumPair(n, targetSum);
        twoSumPairIndex(n, targetSum);
    }

    private static void twoSumPairIndex(int[] n, int targetSum) {
        int IndexArr[] = new int[2];
        List<Integer> list = Arrays.stream(n).boxed().collect(Collectors.toList());
        int sum =0;
        for(int i=0;i< n.length;i++) {
            sum = sum +n[i];
            if(list.contains(targetSum - n[i]) && list.indexOf(targetSum - n[i]) !=-1) {
                IndexArr[0] = i;
                IndexArr[1] = list.indexOf(targetSum - n[i]);
                break;
            }
        }

        System.out.println(Arrays.toString(IndexArr));

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
