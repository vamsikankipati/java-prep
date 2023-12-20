package com.algorithms.datastructures;


public class Tree<T> {
    Node node;

    private class Node {
        T data;
        Node child;
    }
}
