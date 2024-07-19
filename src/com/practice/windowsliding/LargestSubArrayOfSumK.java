package com.practice.windowsliding;

public class LargestSubArrayOfSumK extends Thread {

    public static void main(String[] args) {
        int n[] = {-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
        int max = largestSubArrayOfSum(n, 15);
        System.out.println(max);
    }

    private static int largestSubArrayOfSum(int[] n, int k) {

        int l = 0, j = 0, max = 0, sum = 0;

        while (j < n.length) {
            sum = sum + n[j];
            if (sum == k) {
                max = Math.max((j - l) + 1, max);
            } else if (sum > k) {
                while (sum > k) {
                    sum = sum - n[l];
                    l++;
                }
            }
            j++;
        }
        return max;
    }
}
