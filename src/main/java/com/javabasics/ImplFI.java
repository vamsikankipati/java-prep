package com.javabasics;

public class ImplFI {

    public static void main(String[] args) {
        CustomFunctionalInterface fi = (a) -> a * 3;
        System.out.println(fi.sum(3));
        String str = new String();
    }
}
