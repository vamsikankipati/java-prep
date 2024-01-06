package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CodeWars {
    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> aList = Arrays.stream(a).boxed().toList();
        List<Integer> bList = Arrays.stream(b).boxed().toList();
        List<Integer> result = aList.stream().filter(ele -> !bList.contains(ele)).toList();

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] arrayDiff2(int[] a, int[] b) {

        return IntStream.of(a).filter(ele -> IntStream.of(b).noneMatch(ele1 -> ele1 == ele)).toArray();
    }
}
