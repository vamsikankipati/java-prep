package com.org.practice.algorithms.datastructures;

import lombok.Data;


@Data
public class LinkedList<T> {

    T first;
    Node nextNode;

    private class Node {
        T data;
        Node child;
    }
}
