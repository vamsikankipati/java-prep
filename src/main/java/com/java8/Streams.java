package com.java8;

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Vamsi", "Akhila", "K", "M");

        int strSum = list.stream() // Stream Operation
                .mapToInt(str -> str.length()) // Intermediate Operation
                .sum(); // Terminal Operation

        System.out.println("sum: " + strSum);

        List<String> takeOutput = list.stream()
                .takeWhile(ele -> ele.equalsIgnoreCase("Vamsi")) // Since Java 9
                .toList();

        List<String> dropOutput = list.stream()
                .dropWhile(ele -> ele.equalsIgnoreCase("Vamsi")) // Since Java 9
                .toList();

        System.out.println(takeOutput);
        System.out.println(dropOutput);

    }
}
