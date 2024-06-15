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

        int l = 0, j = 0, ans = 0, k = anagramStr.length();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map = anagramStr.chars().boxed().collect(Collectors.toMap(m -> (char) m.intValue(), v -> 1, Integer::sum));

        int count = map.size();
        while (j < str.length()) {

            if (map.containsKey(str.charAt(j))) {
                map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) - 1);
                if (map.get(str.charAt(j)) == 0) {
                    count--;
                }
            }
            if ((j - l) + 1 == k) {
                if (count == 0) {
                    ans++;
                }
                if (map.containsKey(str.charAt(l)) && map.get(str.charAt(l)) > 0) {
                    map.put(str.charAt(l), map.getOrDefault(str.charAt(l), 0) - 1);
                }  if (map.containsKey(str.charAt(l)) && map.get(str.charAt(l)) == 0) {
                    map.put(str.charAt(l), map.getOrDefault(str.charAt(l), 0) + 1);
                    count++;
                }
                l++;
                j++;

            }
            j++;
        }

        return ans;
    }


}
