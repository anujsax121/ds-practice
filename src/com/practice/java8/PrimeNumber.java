package com.practice.java8;

import java.util.Arrays;

public class PrimeNumber {

    public static void main(String[] args) {
        isPrimeNumber(4);
        isPrimeNumberUsingJava8(new int[]{1, 5, 10, 12, 7, 9});
    }

    private static void isPrimeNumberUsingJava8(int n[]) {
        int count = 1;
        //Arrays.stream(n).filter(i -> i%i/2 ==0 &&  )
    }

    private static void isPrimeNumber(int num) {
        int count = 1;
        for (int i = num / 2; i >= 1; i--) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("It is prime number " + num);
        } else {
            System.out.println("It is not prime number " + num);
        }
    }
}
