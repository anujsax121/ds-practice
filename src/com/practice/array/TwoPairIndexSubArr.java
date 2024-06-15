package com.practice.array;

import java.util.*;
import java.util.stream.Collectors;

public class TwoPairIndexSubArr {

    public static void main(String[] args) {
        int n[] = {6, 2, 7, 9, 11, 15};
        getIndexSumEqual(n, 9);
    }

    private static void getIndexSumEqual(int[] n, int targetSum) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < n.length; i++) {

            sum = sum + n[i];
            if (map.containsKey(sum - targetSum)) {
                if (i - (map.get(sum - targetSum) + 1) + 1 == 2)
                    System.out.println("{" + (map.get(sum - targetSum) + 1) + "," + i + " }");
                return;
            }
            map.put(sum, i);

        }

    }
}
