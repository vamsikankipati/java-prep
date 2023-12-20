package com.algorithms.sorting;

public class SelectionSort {

    public static boolean less(char a, char b) {
        return a - b < 0;
    }

    public static void main(String[] args) {
        System.out.println("Less : " + less('3', '2'));
    }
}
