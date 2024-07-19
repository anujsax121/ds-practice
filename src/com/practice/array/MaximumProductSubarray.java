package com.practice.array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MaximumProductSubarray {

    public static void main(String[] args) {

        int n[] = {0, 10, 10, 10, 10, 10, 10, 10, 10, 10, -10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 0};
        String s = "a good  example";

       // String s1 = Arrays.stream(arr).filetr(f ->).collect(Collectors.joining(" "));

        int maxProd = maxProduct(n);

    }


    public static int maxProduct(int[] nums) {


        int left = 1;
        int right = 1;
        int n = nums.length - 1;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if(left ==0) {
                left =1;
            } if(right ==0) {
                right =1;
            }
            left = left * nums[i];
            right = right * nums[n - i];
            ans = Math.max(Math.max(left, right), ans);
        }

        System.out.println(ans);

        return 0;

    }
}
