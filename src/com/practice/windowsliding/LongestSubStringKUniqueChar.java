package com.practice.windowsliding;

import java.net.StandardSocketOptions;
import java.util.HashMap;
import java.util.Map;

public class LongestSubStringKUniqueChar {

    public static void main(String[] args) {

        String str = "aabacbebebe";
        int max = getLongestSubStringLength(str, 3);
        System.out.println(max);
    }

    private static int getLongestSubStringLength(String str, int k) {

        int ans = Integer.MIN_VALUE;
        int l = 0, j = 0, count = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (j < str.length()) {
            map.put(str.charAt(j), map.getOrDefault(str.charAt(l), 0) + 1);
            if (map.size() == k) {
                ans = Math.max((j - l) + 1, ans);
            } else if (map.size() > k) {
                while (map.size() > k) {
                    if (l < str.length() && map.containsKey(str.charAt(l))) {
                        map.put(str.charAt(l), map.getOrDefault(str.charAt(l), 0) - 1);
                        if (map.get(str.charAt(l)) == 0) {
                            map.remove(str.charAt(l));
                        }
                        l++;
                    }
                }

            }
            j++;
        }

        return ans;

    }
}
