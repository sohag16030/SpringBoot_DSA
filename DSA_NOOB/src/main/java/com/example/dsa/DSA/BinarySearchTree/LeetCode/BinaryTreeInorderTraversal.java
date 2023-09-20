package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
    }
    public static List<Integer> preorderHelper(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        list = inHelper(root, list);
        return list;
    }
    private static List<Integer> inHelper(TreeNode root, List<Integer> list) {
        if (root == null) return list;
        inHelper(root.left,list);
        inHelper(root.right,list);
        list.add(root.val);
        return list;
    }
}
