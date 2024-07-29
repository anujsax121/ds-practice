package com.practice.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCountOccurence {
    public static void main(String[] args) {

        String str = "coodinng";
        Map<Character, Long> map = str
                .chars()
                .boxed()
                .collect(Collectors.groupingBy(m -> (char) m.intValue(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldKey, newKey) -> newKey, LinkedHashMap::new));
        System.out.println(map);

        int n[] = {1, 2, 3, 1};
        int key = Arrays.stream(n).boxed().collect(Collectors.groupingBy(f -> f.intValue(), Collectors.counting())).entrySet().stream().filter(f -> f.getValue() ==1)
                .findFirst().get().getKey();
        System.out.println(key);



    }
}
