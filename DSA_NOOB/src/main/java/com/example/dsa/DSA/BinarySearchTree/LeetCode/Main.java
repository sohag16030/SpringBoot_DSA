package com.example.dsa.DSA.BinarySearchTree.LeetCode;

public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        System.out.println(minStack.top());
        System.out.println( minStack.getMin());
        minStack.pop();
        minStack.push(-3);
        System.out.println( minStack.getMin());

    }
}
