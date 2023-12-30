package com.java8.jls;

import java.util.concurrent.*;

public class AsyncProgramming {

    // newFixedThreadPool is a factory method
    // Executors produce a factory of methods

    ExecutorService executorService;

    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(1);

        CompletableFuture<String> futureCallable = CompletableFuture.supplyAsync(() -> {
            return "Run async";
        }, executor);
        if (futureCallable.isDone()) {
            System.out.println("async done");
        } else if (futureCallable.isCompletedExceptionally()) {
            System.out.println("async completedExceptionally");
        }
    }
}
