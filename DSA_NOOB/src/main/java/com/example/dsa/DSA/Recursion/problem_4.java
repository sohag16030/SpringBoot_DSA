package com.example.dsa.DSA.Recursion;

public class problem_4 {
    public static void main(String[] args) {
        int x = 3;
       int ans = powerOfNumber(5);
    }
    static int sum = 0;
    private static int powerOfNumber(int n) {
        if(n==0) return 1;
        sum = sum + powerOfNumber(n-1);
        return n;
    }
}
