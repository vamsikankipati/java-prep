package com.java8;

public interface DefaultStatic {

    int calculate(int a);

    default String get() {
        return "default method";
    }

    static int update(int value) {
        return value * 2;
    }
}
