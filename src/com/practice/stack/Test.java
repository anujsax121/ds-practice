package com.practice.stack;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int [] arr = new int []{7, 6, 9, 3, 0, 8, 5};

       // 0,3,5,6,7,8,9 -> 8
        int sum =15;
        triplateSum(arr, sum);
    }

    private static void triplateSum(int arr[], int sum) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println(arr[i] + ","+arr[j] + ", " + arr[k]);

                    }
                }
            }

        }
    }

    private static void triplateSumSecondApproach(int arr[], int sum) {

        Arrays.sort(arr);
        int l =0, j=arr.length;
        for (int i = 0; i < arr.length; i++) {
              sum = sum -arr[i];



        }
    }
}
