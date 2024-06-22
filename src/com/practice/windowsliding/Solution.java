package com.practice.windowsliding;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int n[] = {1, 3, -1, -3, 5, 3, 6, 7};
        List<Integer> ansList = maxSlidingWindow(n, 3);
        System.out.println(ansList);
    }

    private static List<Integer> maxSlidingWindow(int n[], int k) {
        List<Integer> ansList = new ArrayList<Integer>();
        List<Integer> maxList = new ArrayList<Integer>();
        int l = 0, j = 0, max = 0;
        while (j < n.length) {
            maxList.add(n[j]);
            if ((j - l) + 1 < k) {
                j++;
            } else if ((j - l) + 1 == k) {
                max = Collections.max(maxList);
                ansList.add(max);
                if(!maxList.isEmpty()) {
                    maxList.remove(maxList.get(0));
                }

                l++;
                j++;
            }
        }
       Object[] arr = ansList.toArray();
        System.out.println(Arrays.toString(arr));
        return ansList;
    }
}
