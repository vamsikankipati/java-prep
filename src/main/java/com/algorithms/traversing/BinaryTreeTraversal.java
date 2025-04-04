package com.algorithms.traversing;

import com.algorithms.datastructures.BinaryTree;

public class BinaryTreeTraversal {
    public static void main(String[] args) {
        // initialize a binary tree
        BinaryTree<Integer> binaryTree = new BinaryTree<>(100,
                new BinaryTree<>(50, new BinaryTree<>(25, null, null), new BinaryTree<>(75, null, null)),
                new BinaryTree<>(150, new BinaryTree<>(125, null, null), new BinaryTree<>(175, null, null))
        );
        // traversal using recursion
        BinaryTreeTraversal traversal = new BinaryTreeTraversal();
        System.out.println("Binary Tree Traversal:" + traversal.preOrderTraversal(binaryTree));

    }

    // TODO - complete tree traversal - (expected is traverse all the way from root node to leaf node)
    public String preOrderTraversal(BinaryTree tree) {
        if (null != tree && null != tree.getData()) {
            StringBuilder sb = new StringBuilder();
            sb.append(tree.getData());
            if (null != tree.getLeft()) {
                sb.append("->").append(preOrderTraversal(tree.getLeft()));
            }
            if (null != tree.getRight()) {
                sb.append("=>").append(preOrderTraversal(tree.getRight()));
            }
            return sb.toString();
        } else {
            return "";
        }
    }

    // TODO - implement recursive and iterative techniques for binary tree traversal (in-order, pre-order, post-order)

}
