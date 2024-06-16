package com.practice.windowsliding;

import java.util.ArrayList;
import java.util.List;

public class FirstNegNumberInEveryWindow {

    public static void main(String[] args) {
        int n[] = {12, -1, -7, 8, -15, 30, 16, 28};
        List<Integer> ansList = firstNegNumberWithSize(n, 3);
        System.out.println(ansList);
    }

    private static List<Integer> firstNegNumberWithSize(int[] n, int k) {

        List<Integer> negList = new ArrayList<>();
        List<Integer> ansList = new ArrayList<>();
        int l = 0, j = 0;

        while (j < n.length) {
            if (n[j] < 0) {
                negList.add(n[j]);
            }
            if ((j - l) + 1 < k) {
                j++;
            } else if ((j - l) + 1 == k) {
                if (negList.isEmpty()) {
                    ansList.add(0);
                } else {
                    ansList.add(negList.get(0));
                }
                if (n[l] < 0) {
                    if (!negList.isEmpty()) {
                        negList.remove(negList.get(0));
                    }
                }
                l++;
                j++;
            }
        }

        return ansList;
    }
}
