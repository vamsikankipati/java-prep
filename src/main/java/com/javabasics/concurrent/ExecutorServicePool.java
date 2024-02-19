package com.javabasics.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorServicePool {

    Executor exec = Executors.newFixedThreadPool(10);
}
