package com.practice.binarysearch;

public class CountOfElement {

    public static void main(String[] args) {
        int n[] = {1, 1, 2, 2, 2, 2, 3}, target = 2;
        getCountElementReoccurence(n, target);
    }

    private static int getCountElementReoccurence(int[] n, int target) {

        int firstOccurence = binarySearchApproach(n, target, Type.FIRST);

       // int lastOccurence = binarySearchApproach(n, target, Type.LAST);

        System.out.println(n[firstOccurence]);

        return 0;

    }

    private static int binarySearchApproach(int[] n, int target, Type flag) {

       int temp =0, l =0, j = n.length, mid =0;
       while(l < j) {
           mid = (l+j)/2;
           if(n[mid] == target) {
                temp = n[mid];
                j = mid -1;
           } else if(n[mid] < target) {
               l = mid+1;
           } else {
               j = mid;
           }
       }
        return temp;

    }
}

enum Type {
    FIRST,
    LAST
}
