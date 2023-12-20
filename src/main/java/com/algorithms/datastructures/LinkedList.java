package com.algorithms.datastructures;


public class LinkedList<T> {

    T first;
    Node nextNode;

    private class Node {
        T data;
        Node child;
    }
}
