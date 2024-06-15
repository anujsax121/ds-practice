package com.practice.java8;

public class LamdaExpressionTest {

    public static void main(String[] args) {

        A a = (int x, int y) -> {return x+y;};

        System.out.println(a.sum(1,3));

    }
}

interface A {
    int sum(int x, int y);
}
