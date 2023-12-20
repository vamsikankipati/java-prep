package com.java8.jls;


import java.util.concurrent.ExecutorService;

//@ToString
public class Synchronize {


    // Each object is associated with a monitor which is used by synchronized methods/statement to provide
    // control over concurrent access to state by multiple threads.

    int x, y = 2;

    synchronized int getData() {
        int z = 1;
        return y + z;
    }

    public static void main(String[] args) {
        Synchronize s = new Synchronize();
        System.out.println("get sync data : " + s.getData());
    }

}
