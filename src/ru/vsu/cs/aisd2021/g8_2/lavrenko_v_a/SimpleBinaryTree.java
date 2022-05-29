package ru.vsu.cs.aisd2021.g8_2.lavrenko_v_a;

public class SimpleBinaryTree {
    private final TreeNode root;

    public SimpleBinaryTree(int n) {
        root = addElement(n);
    }

    private TreeNode addElement(int n) {
        TreeNode current = new TreeNode(n);

        if (n > 1) {
            current.left = addElement(n - 1);
            current.right = addElement(n - 2);
            current.value = current.left.value + current.right.value;
        }
        return current;
    }

    public void printTree(){
        BinaryTreePrinter.printNode(root);
    }
}
