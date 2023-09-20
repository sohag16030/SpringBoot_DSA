package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.*;

public class MinStack {
    List<Integer> list = new ArrayList<>();
    Stack<Integer> stack = null;

    public MinStack() {
       stack = new Stack<>();
    }

    public void push(int val) {
        list.add(val);
        stack.push(val);
    }

    public  void pop() {
        System.out.println(list.indexOf(stack.peek()));
        list.remove(list.indexOf(stack.peek()));
        stack.pop();
    }

    public  int top() {
        return stack.peek();
    }

    public int getMin() {
        Collections.sort(list);
        return list.get(0);
    }
}

