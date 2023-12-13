package com.org.practice.algorithms.datastructures;

import lombok.Data;


@Data
public class Stack<Item> {

    private Node first;
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    // isEmpty

    // size()

    // push()

    // pop()


}
