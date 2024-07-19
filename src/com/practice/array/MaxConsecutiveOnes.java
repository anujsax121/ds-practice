package com.practice.array;

//Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

public class MaxConsecutiveOnes {

    public static void main(String[] args) {

        int  n[] = {1, 1, 0, 1, 1, 1};
        int j =0, max =0;

        for(int i =0;i< n.length;i++) {
            if(n[i] ==1) {
                j++;
                max = Math.max(max, (i-j)+1);
            } else {
                j=0;
            }

        }
        System.out.println(max);

    }
}
