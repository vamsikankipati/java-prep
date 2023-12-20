package com.java8.jls;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AsyncProgramming {

    // newFixedThreadPool is a factory method
    // Executors produce a factory of methods
    Executor executor = Executors.newFixedThreadPool(3);
}
