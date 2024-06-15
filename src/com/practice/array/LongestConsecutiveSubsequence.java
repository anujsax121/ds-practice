package com.practice.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int arr[] = {1, 9, 3, 10, 4, 20, 2};
        int count = findLongestConseqSubseq(arr);
        System.out.println(count);
    }

    private static int findLongestConseqSubseq(int[] arr) {
        HashSet<Integer> S = new HashSet<Integer>();
        int ans = 0;

        // Hash all the array elements
        for (int i = 0; i < arr.length; ++i)
            S.add(arr[i]);

        // check each possible sequence from the start
        // then update optimal length
        for (int i = 0; i < arr.length; ++i) {
            // if current element is the starting
            // element of a sequence
            if (!S.contains(arr[i] - 1)) {
                // Then check for next elements
                // in the sequence
                int j = arr[i];
                while (S.contains(j)) {
                //    S.remove(Integer.valueOf(j));//this will improve runtime by avoiding the repetitive counts of elements
                    j++;
                }

                // update  optimal length if this
                // length is more
                if (ans < j - arr[i])
                    ans = j - arr[i];
            }
        }
        return ans;
    }
}
