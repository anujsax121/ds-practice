package com.practice.windowsliding;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccuerenceAnagram {

    public static void main(String[] args) {
        String str = "forxxorfxdofr";

        String anagramStr = "for";
        int count = getCountOccuerenceAnagram(str, anagramStr);
        System.out.println(count);
    }

    private static int getCountOccuerenceAnagram(String str, String anagramStr) {

        int k = anagramStr.length();
        int l = 0, j = 0, ans = 0;
        Map<Character, Long> map = anagramStr.chars()
                .boxed()
                .collect(Collectors.groupingBy(m -> (char) m.intValue(), Collectors.counting()));
        int count = map.size();
        while (j < str.length()) {
            if (map.containsKey(str.charAt(j))) {
                map.put(str.charAt(j), map.get(str.charAt(j)) - 1);
                if (map.get(str.charAt(j)) == 0) {
                    count--;
                }
            }
            if ((j - l) + 1 < k) {
                j++;
            } else if ((j - l) + 1 == k) {
                if (count == 0) {
                    ans++;
                }
                if (map.containsKey(str.charAt(l)) && map.get(str.charAt(l)) > 0) {
                    map.put(str.charAt(l), map.get(str.charAt(l)) - 1);

                } else if (map.containsKey(str.charAt(l)) && map.get(str.charAt(l)) == 0) {
                    map.put(str.charAt(l), map.get(str.charAt(l)) + 1);
                }

                l++;
                j++;

            }
        }
        return ans;
    }


}
