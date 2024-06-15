package com.practice.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoStreams {

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("1", "2", "3");
        Stream<String> stream2 = Stream.of("A", "B", "C");
        Stream<String> finalStream = Stream.concat(stream1, stream2);
        System.out.println(finalStream.collect(Collectors.toList()));
    }
}
