package com.practice.array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ProductElementExpectItself {

    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4};
     //   getProductWithDiviableSign(n);
        getProductWithOutDiviableSign(n);
    }

    private static void getProductWithOutDiviableSign(int[] n) {

        int left[] = new int[n.length];
        int right[] = new int[n.length];
        int temp[] = new int[n.length];
        left[0] = 1;
        right[n.length-1] =1;
        for (int i = 1; i < n.length; i++) {
            left[i] = left[i - 1] * n[i-1];
        }

        for (int i = n.length -2; i >=0; i--) {
            right[i] = right[i + 1] * n[i+1];
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

       for(int i=0; i<n.length; i++) {
           n[i] = left[i] * right[i];
       }

       System.out.println(Arrays.toString(n));

    }

   private static void getProductWithDiviableSign(int[] n) {
        int product = Arrays.stream(n).boxed().reduce((s1, s2) -> s1 * s2).get();
        for (int i = 0; i < n.length; i++) {
            n[i] = product / n[i];
        }
        System.out.println(Arrays.toString(n));
    }


}
