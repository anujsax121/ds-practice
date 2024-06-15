package com.practice.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Duplication {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Anuj");
        list.add("Saxena");
        list.add("Anuj");
        list.add("Kumar");
        list.add("Gaurav");

        Set<String> set = new HashSet<String>();
       list = list.stream().filter(f -> set.add(f)).collect(Collectors.toList());
       System.out.println(list);
    }
}
