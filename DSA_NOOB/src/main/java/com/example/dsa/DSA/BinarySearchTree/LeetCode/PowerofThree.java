package com.example.dsa.DSA.BinarySearchTree.LeetCode;

public class PowerofThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(1));
    }

    public static boolean isPowerOfThree(int n) {
        if(n==1) return true;
        if(n<3) return false;
        while (n >= 3) {
            if (n % 3 == 0) {
                n = n / 3;
                System.out.println(n);
            } else return false;
        }
        System.out.println(n);

        if (n == 1) return true;
        return false;
    }
}
