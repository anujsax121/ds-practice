package com.practice.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        String str = "BHBVNJAZXSAEEIJHA";
       Map<Character, Long> map = str.chars().boxed()
               .collect(Collectors.groupingBy(m -> (char) m.intValue(),Collectors.counting()));

       str.chars().boxed().collect(Collectors.toMap(m -> (char)m.intValue(), v ->1, Integer ::sum));
       System.out.println(map);

    }
}
