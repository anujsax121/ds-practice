package com.practice.binarysearch;

public class RoratedSortedArr {

    public static void main(String[] args) {
        int n[] = {4, 5, 6, 7, 8, 0, 1, 2};
        int index = getRoratedSortedArray(n);
        // int index = getRoratedSortedArraySecondApproach(n);
        System.out.println(index);
    }

    private static int getRoratedSortedArraySecondApproach(int[] n) {

        int l = 0, j = n.length - 1, mid = 0, ans = Integer.MAX_VALUE;
        while (l <= j) {
            mid = (l + j) / 2;
            if (n[l] <= n[j]) {
                ans = Math.min(ans, n[l]);
                break;
            } else if (n[l] <= n[mid]) {
                ans = Math.min(n[l], ans);
                l = mid + 1;
            } else {
                ans = Math.min(n[mid], ans);
                j = mid - 1;
            }
        }
        return ans;
    }

    private static int getRoratedSortedArray(int[] n) {

        int l = 0, j = n.length - 1, mid = 0;
        while (l < j) {
            mid = (l + j) / 2;
            if (n[mid] < n[mid - 1]) {
                return mid;
            } else if (n[mid] > n[mid + 1]) {
                return mid + 1;
            } else if (n[l] < n[mid]) {
                l = mid + 1;
            } else {
                j = mid;
            }
        }
        return 0;

    }
}
