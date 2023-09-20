package com.example.dsa.DSA.BinarySearchTree.LeetCode;

public class BinarySummation {
    public static void main(String[] args) {
        String a = "1101";
        String b = "11";
        String ans = addBinary(a, b);
    }


    private static String addBinary(String a, String b) {
        int aa = Integer.parseInt(a, 2);
        int bb = Integer.parseInt(b, 2);
        int aabb = aa + bb;
        return Integer.toBinaryString(aabb);
    }
}
