package com.practice.binarysearch;

public class FindPeekElement {

    public static void main(String[] args) {
        int nums [] = {1,2,3,1};
       int index =  findPeekElement(nums);
       System.out.println(index);
    }

    private static int findPeekElement(int[] n) {

        int l =0, j = n.length-1, size = n.length-1;
        if(l == size) {
            return l;
        }

        while(l <=j) {
            int mid = l + (j-l)/2;
            if(mid > 0 && mid < n.length -1) {
                if(n[mid] > n[mid-1] && n[mid] > n[mid +1]) {
                    return mid;
                } else if(n[mid] < n[mid+1]) {
                    l = mid+1;
                } else if(n[mid] < n[mid-1]) {
                    j = mid-1;
                }
            } else if(mid ==0) {
                if(n[0] < n[1]) {
                    return 1;
                } else {
                    return 0;
                }
            }
            else if(mid ==size) {
                if(n[size] > n[size-2]) {
                    return size;
                } else {
                    return size-2;
                }
            }
        }

        return -1;
    }
}
