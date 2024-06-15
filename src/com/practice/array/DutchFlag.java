package com.practice.array;

import java.util.Arrays;

public class DutchFlag {

    public static void main(String[] args) {
        int n[] = {0, 1, 2, 0, 1, 2};
        dutchFlag(n);
    }

    private static void dutchFlag(int[] n) {
        int mid =0, l =0 , j = n.length-1;
        while(mid <= j) {

            switch(n[mid]) {
                case 0: {
                    swap(l,mid,n);
                    l++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                   swap(mid,j,n);
                   j--;
                    break;
                }

            }

        }
        System.out.println(Arrays.toString(n));
    }

    private static void swap(int i, int j, int[] n) {

        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;

    }

}
