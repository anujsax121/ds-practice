package com.practice.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedMapByKeyReversedOrder {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Anuj", 1);
        map.put("Anurag", 2);
        map.put("Divay", 2);
        map.put("Saxen", 5);
        map.put("Kumar", 3);
        map.put("Nishchay", 8);
        map.put("Siya", 7);
        map.put(null, 9);
        //  sortedMapByKey(map);
        // sortedMapByKeyReverseOrder(map);
        sortedMapByKeyReverseOrderNullFirst(map);
    }

    private static void sortedMapByKeyReverseOrderNullFirst(Map<String, Integer> map) {
        map = map.entrySet()
                .stream().sorted(Map.Entry.comparingByKey(Comparator.nullsFirst(Comparator.naturalOrder())))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldKey, newKey) -> newKey, LinkedHashMap::new));
        System.out.println("Null First Place");
        System.out.println(map);
    }

    private static void sortedMapByKeyReverseOrder(Map<String, Integer> map) {
        map = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldKey, newKey) -> newKey, LinkedHashMap::new));
        System.out.println("Reversed Order Map Sorted By Key");
        System.out.println(map);
    }

    private static void sortedMapByKey(Map<String, Integer> map) {

        map = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldKey, newKey) -> oldKey, LinkedHashMap::new));
        System.out.println(map);
    }
}
