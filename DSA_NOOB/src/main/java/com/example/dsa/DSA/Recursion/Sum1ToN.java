package com.example.dsa.DSA.Recursion;

public class Sum1ToN {

    public static void main(String[] args) {
        System.out.println(sumfind(3));
    }

    private static int sumfind(int n) {
        if (n == 0) return 0;
        else return n + sumfind(n - 1);
    }
}
