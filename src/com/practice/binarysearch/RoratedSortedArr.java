package com.practice.binarysearch;

public class RoratedSortedArr {

    public static void main(String[] args) {
        int n[] = {8, 9, 10, 11, 2, 3, 4, 5};

        int index = getRoratedSortedArray(n);
        System.out.println(n[index] + " index " + index);
    }

    private static int getRoratedSortedArray(int[] n) {

        int l = 0, j = n.length, mid = 0;
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
        return -1;

    }
}
