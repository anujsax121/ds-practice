package com.practice.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapTest {

    public static void main(String[] args) {
        List<Department> deptList = new ArrayList<Department>();
        deptList.add(new Department(1, "IT"));
        deptList.add(new Department(2, "HR"));
        deptList.add(new Department(3, "Management"));
        deptList.add(new Department(4, "Development"));
        deptList.add(new Department(5, "Recruitment"));
        deptList.add(new Department(6, null));

        Map<Integer, String> map = new HashMap<>();

         map = deptList.stream().collect(HashMap::new, (m,v) -> m.put(v.getDeptId(), v.getDeptName()), HashMap ::putAll );
        System.out.println(map);

       // deptList.forEach(k -> map.put(k.getDeptId(),k.getDeptName()));
        System.out.println(map);

    }
}
