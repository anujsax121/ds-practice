package com.practice.string;

public class StringCovertInt {

    public static void main(String[] args) {
        String str = "12345";
        int num = convertStringFromInt(str);
        System.out.println(num);
    }

    private static int convertStringFromInt(String str) {

        int result = 1;
        char ch[] = str.toCharArray();
        for (int i = 1; i < str.length(); i++) {
            result = result * 10 + (ch[i] - '0');
        }


        return result;

    }
}
