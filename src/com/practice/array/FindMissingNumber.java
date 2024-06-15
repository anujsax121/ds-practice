package com.practice.array;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        int n[] = {1, 2, 3, 5};
        int missingNumber = missingNumber(n);
        System.out.println("missing number " + missingNumber);
    }

    private static int missingNumber(int[] n) {

        int sum = Arrays.stream(n).sum();
        int nthOfSum = n[n.length - 1] * (n[n.length - 1] + 1) / 2;

        return nthOfSum - sum;

    }
}
