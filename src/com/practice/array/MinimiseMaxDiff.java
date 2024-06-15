package com.practice.array;

import java.util.Arrays;

public class MinimiseMaxDiff {

    public static void main(String[] args) {
        int arr[] = {1, 5, 8, 10};
        int ans = getMinDiff(arr, 2);
        System.out.println(ans);
    }

    private static int getMinDiff(int[] arr, int k) {

        Arrays.sort(arr);
        int tempMin = arr[0];
        int tempMax = arr[arr.length - 1];
        int ans = arr[arr.length - 1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            tempMin = Math.min(arr[0] + k, arr[i] - k);
            tempMax = Math.max(arr[i-1] + k, arr[arr.length - 1] - k);
            ans = Math.min(tempMax-tempMin, ans);
        }

        return ans;
    }
}
