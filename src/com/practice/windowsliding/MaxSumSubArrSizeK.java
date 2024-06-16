package com.practice.windowsliding;

public class MaxSumSubArrSizeK {

    public static void main(String[] args) {
        int n[] = {2, 5, 1, 8, 2, 9, 1};
        int sum = maxSumSubArrSizeK(n, 3);
        System.out.println(sum);
    }

    private static int maxSumSubArrSizeK(int[] n, int k) {
        int l = 0, j = 0, ans = 0, sum = 0;
        while (j < n.length) {
            sum = sum + n[j];
            if ((j-l)+1< k) {
                j++;
            } else if ((j-l)+1 == k) {
                ans = Math.max(sum, ans);
                sum = sum - n[l];
                j++;
                l++;
            }

        }
        return ans;
    }
}
