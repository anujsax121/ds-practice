package com.practice.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        // getLongestCommonPrefixUsingJava8(Arrays.asList("flower", "flow", "flight"));
        // getLongestCommonPrefix(new String[]{"flower", "flow", "flight"});
        getLongestCommonPrefixUsingMap(new String[]{"flower", "flow", "flight"});
    }

    private static void getLongestCommonPrefix(String str[]) {
        Arrays.sort(str, Comparator.comparing(String::length));

        String s1 = str[0];
        for (int i = 1; i < str.length; i++) {
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) != str[i].charAt(j)) {
                    s1 = s1.substring(0, j);
                    break;
                }
            }

        }
        System.out.println(s1);
    }

    private static void getLongestCommonPrefixUsingJava8(List<String> strings) {

        String commonStr = strings.stream()
                .reduce((s1, s2) -> {
                    int len = Math.min(s1.length(), s2.length());
                    int i = 0;
                    while (i < len && s1.charAt(i) == s2.charAt(i)) {
                        i++;
                    }
                    return s1.substring(0, i);
                }).orElse("");
        System.out.println(commonStr);
    }

    public static void getLongestCommonPrefixUsingMap(String str[]) {

    }
}
