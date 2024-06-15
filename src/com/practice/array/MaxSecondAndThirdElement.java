package com.practice.array;

public class MaxSecondAndThirdElement {

    public static void main(String[] args) {
        int n[] = {1, 5, 16, 8, 34, 12, 2};
        findMaxMinAndSecond(n);
    }

    private static void findMaxMinAndSecond(int[] n) {

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, second = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                second = max;
                max = n[i];
            } else if (n[i] > second && max != n[i]) {
                second = n[i];
            } else if (n[i] < min) {
                min = n[i];
            }
        }
        System.out.println(max + " " + second + " "+min);
    }
}
