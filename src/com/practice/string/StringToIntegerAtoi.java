package com.practice.string;

public class StringToIntegerAtoi {

    public static void main(String[] args) {
        String str = "-91283472332";
        int val = myAtoi(str);
        System.out.println(val);

    }

    public static int myAtoi(String s) {
         Integer add =0;
         StringBuilder builder = new StringBuilder();
         boolean flag = false;
         int index =0;
        for(char c : s.trim().toCharArray()) {

            if(Character.isDigit(c)) {
                add = (add *10) + c - (char) 48;
            } else if(index == 0 && c == '-') {
                flag =true;

            }
                else {
                s = s.trim();
                if (s.startsWith("-")) {
                    flag = true;
                }
                break;
            }
            index++;
        }
        if(flag) {
            return 0- add;
        }
       return add;
    }
}
