package com.practice.array;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int a[] = {1, 5, 4, 3};
        int len1 = 4;
        System.out.print(maxArea(a, len1) + "\n");
    }

    private static int maxArea(int[] a, int len1) {

        int l = 0, j = a.length - 1, maxArea = 0;
        while (l < j) {
            maxArea = Math.max(maxArea, Math.min(a[l], a[j]) * (j - l));
            if (a[l] < a[j]) {
                l++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
