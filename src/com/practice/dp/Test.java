package com.practice.dp;

public class Test {

    public static void main(String[] args) {
        String s = "9899100102";
        if (isConsecutiveOrNot(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


    private static boolean isConsecutiveOrNot(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (checkConsecutive(s.substring(0, i + 1), s)) {
                return true;
            }
        }


        return false;
    }

    private static boolean checkConsecutive(String str, String org) {


        int num = Integer.valueOf(str);

        int j = 0;
        String result = "";
        while (true) {
            if (org.equals(result)) {
                return true;
            } else if(!org.startsWith(result)) {
                return false;
            }
            result = result + num;
            num++;
            j++;

        }
    }


}




