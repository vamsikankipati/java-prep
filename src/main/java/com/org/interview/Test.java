package com.org.interview;

import lombok.Data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class Test {


    public static void main(String[] args) {
        System.out.println("highest: " + calculateHighest());
    }

    private static int calculateHighest() {
        List<Integer> input = Arrays.asList(1,1,2,2);
        Set<Integer> unique = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : input) {
            unique.add(num);
        }
        List<Integer> uniqueList = unique.stream().toList();
        for (Integer val : uniqueList) {
            for (Integer num : input) {
                if (val.equals(num)) {
                    int count = map.get(val) == null ? 1 : map.get(val) + 1;
                    map.put(val, count);
                }
            }
        }
        System.out.println("map" + map.toString());

        Integer highest = 0;
        for (Map.Entry entry : map.entrySet()) {
            int currentVal = (int) entry.getValue();
            if (currentVal > highest) {
                highest = (int) entry.getKey();
            }
        }

        return highest;
    }
}
