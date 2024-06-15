package com.practice.string;

public class RepeactStringWithOutLoop {

    public static void main(String[] args) {
        String str = "anuj";
        String resultStr = repeatChar(str, str.length());
        System.out.println(resultStr);
    }

    private static String repeatChar(String str, int length) {

        System.out.println(str +" "+length);
        if (length == 0) {
            return str;
        }
        return repeatChar(str.charAt(length-1) + str.substring(0,length-1), length-1);
    }
}
