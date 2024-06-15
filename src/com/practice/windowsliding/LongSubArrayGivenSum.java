package com.practice.windowsliding;

public class LongSubArrayGivenSum {

    public static void main(String[] args) {
        int n[] = {4, 1, 1, 1, 2, 3, 5};
        int targetSum = 5;
        int max = largestSubArraySum(n, targetSum);
        System.out.println(max);
    }

    private static int largestSubArraySum(int[] n, int targetSum) {

        int l = 0, j = 0, sum = 0, max = Integer.MIN_VALUE;

        while (j < n.length) {

            sum = sum + n[j];
            if (sum == targetSum) {
                max = Math.max(max, (j - l) + 1);
            }
            else if(targetSum < sum) {
                while(l < n.length && targetSum < sum) {
                    sum = sum - n[l];
                    l++;
                }
            }
            j++;
        }

        return max;
    }
}
