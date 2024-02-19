package com.javabasics;

public interface InterfaceExt {
    default int get(int i) {
        return i * i;
    }
}
