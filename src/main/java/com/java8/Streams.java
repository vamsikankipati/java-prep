package com.java8;

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Vamsi", "Akhila", "K", "M");
        int strSum = strs.stream().mapToInt(str -> str.length()).sum();
        System.out.println("sum: " + strSum);
    }
}
