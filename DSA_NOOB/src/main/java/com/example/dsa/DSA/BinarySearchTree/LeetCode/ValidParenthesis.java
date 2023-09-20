package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        //String s = "[{}{}[]{()}]";
        String s = "}";
        boolean result = isValid(s);
    }

    private static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else {
                char peek = 0;
                if (!stack.isEmpty())
                    peek = stack.peek();
                if (peek == map.get(ch))
                    stack.pop();
                else return false;
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}
