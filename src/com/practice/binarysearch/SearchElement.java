package com.practice.binarysearch;

public class SearchElement {

    public static void main(String[] args) {
        int n [] = {5,1,3};
        int index = search(n, 3);
        System.out.println(index);
    }

    public static int search(int[] nums, int target) {

        int l=0, j = nums.length-1, mid =0;

        while(l<=j) {
            mid = (l+j)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[l] <= nums[mid]) {
                if(nums[l] <= target && target < nums[mid]) {
                    j = mid-1;
                } else {
                    l = mid+1;
                }
            } else if(nums[mid] <= nums[j]) {
                if(nums[mid] <= target && target <= nums[j]) {
                    l = mid+1;
                } else {
                    j = mid-1;
                }
            }
        }
        return -1;
    }
}
