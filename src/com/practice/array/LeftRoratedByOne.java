package com.practice.array;

import java.util.Arrays;

public class LeftRoratedByOne {

    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5};
        int temp = n[0];
        for (int i = 1; i < n.length; i++) {
            n[i - 1] = n[i];
        }
        n[n.length - 1] = temp;
        System.out.println(Arrays.toString(n));
    }


}
