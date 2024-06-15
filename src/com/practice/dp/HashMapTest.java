package com.practice.dp;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashMapTest {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(3);
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        service.submit(() -> {
                    Map<String, Integer> map = new HashMap<String, Integer>();
                    for (int i = 0; i < 5; i++) {
                        map.put(i + "", i);
                    }
                });
                //map1 = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o, n) -> n)););

        System.out.println(map1);


    }


}
