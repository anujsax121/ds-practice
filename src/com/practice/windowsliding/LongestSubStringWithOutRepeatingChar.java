package com.practice.windowsliding;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithOutRepeatingChar {

    public static void main(String[] args) {
        String str = "pwwkew";
        int ans = longSubStringwithUnquie(str);
        System.out.println(ans);
    }

    private static int longSubStringwithUnquie(String str) {
        int ans = 0, l = 0, j = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (j < str.length()) {
            map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);
            if (map.size() == (j - l) + 1) {
                ans = Math.max(ans, (j - l) + 1);
                j++;
            } else if (map.size() < (j - l) + 1) {
                if (map.containsKey(str.charAt(l))) {
                    map.put(str.charAt(l), map.get(str.charAt(l)) - 1);
                    if (map.get(str.charAt(l)) == 0) {
                        map.remove(str.charAt(l));
                    }
                    l++;
                }
                j++;
            }
        }
        return ans;
    }

}

