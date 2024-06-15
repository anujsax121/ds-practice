package com.practice.array;

public class ConvertCaseOfString {

    public static void main(String[] args) {
        String str = "anuj";
        String ans = toUpperCase(str);
        System.out.println(ans);
        String lower = toLowerCase(ans);
        System.out.println(lower);
    }

    private static String toUpperCase(String str) {

        String ans = "";
        for(int i=0;i<str.toCharArray().length;i++) {

            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                 char c = (char) (str.charAt(i) -(char)32);
                 ans = ans +c+"".trim();
            }
        }
        return ans;
    }

    private static String toLowerCase(String str) {

        String ans = "";
        for(int i=0;i<str.toCharArray().length;i++) {

            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                char c = (char) (str.charAt(i) + (char)32);
                ans = ans +c+"".trim();
            }
        }
        return ans;
    }
}
