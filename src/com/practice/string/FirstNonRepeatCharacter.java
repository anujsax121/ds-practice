package com.practice.string;

import java.net.StandardSocketOptions;

public class FirstNonRepeatCharacter {

    public static void main(String[] args) {
        String str = "HHELLO";
        String nonRepeatChar = findFirstNonRepeatCharUsingJava8(str);
        System.out.println(nonRepeatChar);
    }

    private static String findFirstNonRepeatChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                return str.charAt(i) + "".trim();
            }
        }

        return "N/A";

    }

    private static String findFirstNonRepeatCharUsingJava8(String str) {

        int firstNonRepeatChar = str.chars().boxed()
                .filter(f -> str.indexOf((char) f.intValue()) == str.lastIndexOf((char) f.intValue()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not Found"));
        return (char) firstNonRepeatChar + "".trim();

    }
}
