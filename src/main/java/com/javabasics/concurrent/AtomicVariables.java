package com.javabasics.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.*;

public class AtomicVariables {

    private volatile Integer sharedValue = 0;
    ExecutorService executor = Executors.newFixedThreadPool(3);

    public Integer incrementValue() throws ExecutionException, InterruptedException {
        Future<Integer> future = CompletableFuture.supplyAsync(() -> {
            sharedValue++;
            return sharedValue;
        });
        return future.get();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AtomicVariables at = new AtomicVariables();
        System.out.println("Latest Value: " + at.incrementValue());
        HashMap<String, String> h = new HashMap<>();
        h.put("Vamsi", "9703XXXX31");
    }
}
