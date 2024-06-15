package com.practice.array;

public class MaxSubarraySum {
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum. Kadane's Algorithm

    public static void main(String[] args) {
        int n[] = {1, 2, 3, -2, 5};
        int maxSum = maxSubarraySumByKadaneApproach(n);
        System.out.println(maxSum);

    }


    private static int maxSubarraySum(int arr[], int n) {

        int sum = 0;
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {

                sum = sum + arr[j];
            }
            ans = Math.max(ans, sum);
        }

        return ans;

    }

    private static int maxSubarraySumByKadaneApproach(int arr[]) {
        int sum = 0;
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;

    }

}
