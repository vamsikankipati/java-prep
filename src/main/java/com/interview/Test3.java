package com.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

    // Given a stream of integers represented as arr[]. For each index i from 0 to n-1,
    // print the multiplication of largest, second largest, third largest element of
    // the subarray arr[0…i]. If i < 2 print -1.

    static List<Integer> ip = Arrays.asList(6, 3, 5, 4, 7, 1, 2, 8); // 8 * 7 * 6

    public static void main(String[] args) {
        System.out.println(calculateLargest(ip, 2));

    }

    private static int calculateLargest(List<Integer> input, int size) {
        Collections.sort(input);
        int temp = size;
        int result = 1;
        for (int i = input.size() - 1; i > 0; i--) {
            if (temp > 0) {
                result = result * input.get(i);
                temp--;
            }
        }
        size++;
        return result;
    }

    int i = 1;
//    Integer i = 2;
}
