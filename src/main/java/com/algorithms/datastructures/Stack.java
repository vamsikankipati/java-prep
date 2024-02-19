package com.algorithms.datastructures;



public class Stack<Item> {

    public static void main(String[] args) {
        // Stack DS in Java
        java.util.Stack<String> stck = new java.util.Stack<>();
        stck.push("Vamsi");

    }

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
