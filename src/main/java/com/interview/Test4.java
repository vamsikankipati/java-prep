package com.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test4 {
    // How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?

    public static void main(String[] args) {

        // Write a program to print the First Not Repeated Char in string.
        String input = "Java Stream API is very good concept";

        Map<Character, Long> map = input.chars().mapToObj(i -> (char)i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(map.entrySet().stream().filter(e -> e.getValue() == 1).findFirst());

    }


}
