package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Concurrent {


    AtomicLong atomicCount;
    List<String> list = new ArrayList<>();

//    CompletableFuture<List<String>> future = list.stream() // operation

//    Hashtable<String, String>

//    size > 0
//            .remove one element
    // CountDownLatch


    class Count {
        long count = 0; // AtomicLong

        public void update() {
            if (count < 5) {
                count = count -1;
            }
            count++;
            System.out.println(count);
        }
    }


}
