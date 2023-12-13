package com.org.practice.algorithms.datastructures;

import lombok.Data;


@Data
public class Queue<Item> {

    private Node first;
    private Node last;
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    // isEmpty

    // size()

    // enqueue()

    // dequeue()


}
