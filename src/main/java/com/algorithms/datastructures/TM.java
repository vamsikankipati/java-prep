package com.algorithms.datastructures;

import java.util.Collections;
import java.util.TreeMap;

public class TM {
    public static void main(String[] args) {
        TreeMap t = new TreeMap(); // not thread safe
        t.put("Vamsi", "123");

        Collections.synchronizedSortedMap(t); // thread safe
    }
}
