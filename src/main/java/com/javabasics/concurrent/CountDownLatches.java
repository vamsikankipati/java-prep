package com.javabasics.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatches {


    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cdl = new CountDownLatch(2);
        try {
            System.out.println("Started");
            cdl.await(2000, TimeUnit.MILLISECONDS);
        } finally {
            cdl.countDown();
            System.out.println("Finished");
        }

    }

}
