package com.java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DefaultStaticImpl implements DefaultStatic {


    @Override
    public int calculate(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        DefaultStatic def = new DefaultStaticImpl();
        System.out.println(def.calculate(2));
        System.out.println(DefaultStatic.update(10));
        ExecutorService ex = Executors.newFixedThreadPool(3);
    }
}
