package com.practice.array;

public class ReverseNumber {

    public static void main(String[] args) {
        int x = reverse(-2147483412); //-2143847412
        System.out.println(x);

    }

    public static int reverse(int x) {

        int temp = 0, count =0;
        if(x > 0) {
            while(x > 0) {
                if(count == 9) {
                    return 0;
                }
                temp = (temp*10) + (x%10);
                x = x/10;
                count++;
            }

        } else {
            while(x < 0) {
                if(count == 9) {
                    return 0;
                }
                temp = (temp*10) + (x%10);
                x = x/10;
                count++;
            }

        }
        System.out.println(count);

        return temp;
    }
}
