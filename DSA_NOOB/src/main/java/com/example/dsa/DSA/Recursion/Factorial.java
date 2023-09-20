package com.example.dsa.DSA.Recursion;

public class Factorial {
    public static void main(String[] args) {
        //n = n*(n-1)*(n-2);
        int ans = factoial(5);
        System.out.println(ans);
    }

    private static int factoial(int n) {
        if (n == 0) return 1;
        return n * factoial(n - 1);
    }
}
