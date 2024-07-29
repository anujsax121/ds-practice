package com.practice.array;

public class FindNumAppearsOnce {

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int numOnce = findNumAppearsOnce(arr);
        System.out.println(numOnce);
    }

    private static int findNumAppearsOnce(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum ^ arr[i];
            System.out.println(sum);
        }
        return sum;
    }
}
