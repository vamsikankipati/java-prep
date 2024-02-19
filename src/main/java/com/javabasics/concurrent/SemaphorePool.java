package com.javabasics.concurrent;

import java.util.concurrent.Semaphore;

public class SemaphorePool {

    private static final int MAX_AVAILABLE = 100;

    protected boolean[] used = new boolean[MAX_AVAILABLE];

    protected Object[] items = new Object[100];

    private final Semaphore semaphore = new Semaphore(MAX_AVAILABLE);

    public Object getItem() throws InterruptedException {
        semaphore.acquire();
        return getNextAvailableItem();
    }

    protected synchronized Object getNextAvailableItem() {
        for (int i = 0; i < MAX_AVAILABLE; ++i) {
            if (!used[i]) {
                used[i] = true;
                return items[i];
            }
        }
        return null; // not reached
    }
}
