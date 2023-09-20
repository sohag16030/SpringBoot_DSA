package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        //int[] digits = {9};
        // int[] digits = {1, 2, 9};
       int[] digits = {1, 0, 0, 0, 0};
        int[] ans = plusOne(digits);
    }

    public static int[] plusOne(int[] digits) {
        List<Integer> ans = new ArrayList<>();
        int rest = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) digits[i] += 1;
            else if (i != digits.length - 1) digits[i] = digits[i] + rest;
            if (digits[i] >= 10) {
                ans.add(digits[i] % 10);
                rest = 1;
            } else if (digits[i] < 10) {
                ans.add(digits[i]);
                rest = 0;
            }
        }
        if (rest != 0) {
            ans.add(1);
        }
        int[] finalAns = new int[ans.size()];
        int j = 0;
        for (int i = ans.size() - 1; i > -1; i--) {
            finalAns[j++] = ans.get(i);
        }
        return finalAns;
    }
}
