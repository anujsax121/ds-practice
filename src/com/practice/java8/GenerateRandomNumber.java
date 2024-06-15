package com.practice.java8;

import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateRandomNumber {

    public static void main(String[] args) {
        Random random = new Random();
        Stream<Integer> stream = Stream.generate(random ::nextInt);
        System.out.println(stream);
    }
}
