package com.org.practice.algorithms.datastructures;

import lombok.Data;


@Data
public class Tree<T> {
    Node node;

    private class Node {
        T data;
        Node child;
    }
}
