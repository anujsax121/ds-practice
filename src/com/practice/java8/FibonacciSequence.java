package com.practice.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSequence {

    public static void main(String[] args) {

      //  fibonacci(10);
        Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .mapToLong(f -> f[0])
                .limit(10).forEach(System.out::print);


    }

    private static void fibonacci(int n) {

        int num1 = 0, num2 =1;
        for(int i=0;i<n; i++) {
            System.out.print(num1 +" ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }

    }
}
