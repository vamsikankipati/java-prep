package com.interview;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Test1 {


    public static void main(String[] args) {
        TreeMap<String, String> tMap = new TreeMap<>();
        tMap.put("1", "One");
        tMap.entrySet().parallelStream().toList();

        Stream.iterate(Arrays.asList(1, 2, 3), x -> x).toList();
    }
}
