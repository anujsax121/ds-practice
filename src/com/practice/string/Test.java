package com.practice.string;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String str = "I am Anuj";
        String result = reverseEachWord(str);
        System.out.println(result);
    }

    private static String reverseEachWord(String str) {

        char charArr[] = str.toCharArray();
        String resverString = "";
        String makeString = "";
        for(int i=0;i<charArr.length;i++) {
            if(Character.isAlphabetic(charArr[i])) {
                makeString = charArr[i]+"".trim();
                resverString = resverString + revers(charArr[i]+"".trim()) + " ";
            }
        }

        /*String s[] = str.split(" ");
        String resverString = "";
        for (int i = 0; i < s.length; i++) {

            resverString = resverString + revers(s[i]) + " ";


        }*/
        return resverString;


    }

    private static String revers(String s) {


        System.out.println(s);
        char c[] = s.toCharArray();
        int l = 0, j = s.length() - 1;
        if (s.length() == 1 || s.length() == 0) {
            return s;
        }
        while (l < j) {
            char temp = c[l];
            c[l] = c[j];
            c[j] = temp;
            l++;
            j--;
        }
        return String.valueOf(c);
    }
}
