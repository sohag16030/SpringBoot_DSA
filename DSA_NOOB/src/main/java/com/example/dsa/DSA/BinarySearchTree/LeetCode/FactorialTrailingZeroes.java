package com.example.dsa.DSA.BinarySearchTree.LeetCode;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(trailingZeroes(n));
    }

    private static int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            count = count + n / 5;
            n = n / 5;
        }
        return count;
    }
}
