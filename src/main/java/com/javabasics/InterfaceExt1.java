package com.javabasics;

public interface InterfaceExt1 extends InterfaceExt {
    int get(int i);
    int get(Integer i); // allowed as both int and Integer are different.
}
