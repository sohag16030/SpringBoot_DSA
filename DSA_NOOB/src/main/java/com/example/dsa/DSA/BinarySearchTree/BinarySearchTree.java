package com.example.dsa.DSA.BinarySearchTree;
import java.util.Scanner;
class Node {
    int data;
    Node left;
    Node right;
}

public class BinarySearchTree {
    public static void main(String[] args) {
        System.out.println("binary tree Construction::");
        Node root = create_();
        System.out.println("binary tree preorder traverse::");
        preorder(root);
        System.out.println("\nbinary tree inorder traverse::");
        inorder(root);
        System.out.println("\nbinary tree postorder traverse::");
        postorder(root);
    }

    private static Node create_() {
        System.out.print("enter a value:: ");
        Node root = new Node();
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        root.data = data;
        if (data == -1) return null;
        System.out.print("enter left value of root::" + root.data);
        root.left = create_();
        System.out.print("enter right value of root::" + root.data);
        root.right = create_();
        return root;
    }

    private static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    private static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    private static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}