package com.practice.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EpamQuestion {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("anuj");
        list.add("gaurav");
        list.add("saxena");
       list = list.stream().map(m -> m.substring(0,1).toUpperCase() + m.substring(1)).collect(Collectors.toList());
       System.out.println(list);
    }
}
