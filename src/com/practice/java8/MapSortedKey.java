package com.practice.java8;

import java.net.StandardSocketOptions;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSortedKey {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Anuj", 1);
        map.put("Anurag", 2);
        map.put("Divay", 2);
        map.put("Saxen", 5);
        map.put("Kumar", 3);
        map.put("Nishchay", 8);
        map.put("Siya", 7);
        map.put(null,10);
      // Sorting by Key
        map = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (oldKey, newKey) -> newKey,
                        LinkedHashMap::new));


        System.out.println(map);

    }
}
