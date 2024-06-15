package com.practice.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        getLongestCommonPrefixUsingJava8(Arrays.asList("flower", "flow", "flight"));
        getLongestCommonPrefix(new String[]{"flower", "flow", "flight"});
    }

    private static void getLongestCommonPrefix(String str[]) {
        Arrays.sort(str, Comparator.comparing(String::length));
    }

    private static void getLongestCommonPrefixUsingJava8(List<String> strings) {

        String longestPrefix = strings.stream()
                .reduce((s1, s2) -> {
                    int length = Math.min(s1.length(), s2.length());
                    int i = 0;
                    while (i < length && s1.charAt(i) == s2.charAt(i)) {
                        i++;
                    }
                    return s1.substring(0, i);
                }).orElse("");
        System.out.println(longestPrefix);
    }
}
