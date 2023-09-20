package com.example.dsa.DSA.Recursion;

public class BasicProgram {
    public static void main(String[] args){
        int n =5;
        recusionTraverse(n);
    }

    private static void recusionTraverse(int n) {
        if(n==0) return;
        System.out.println(n);
        recusionTraverse(n-1);// activation record
        System.out.println(n); // Execution pointer
    }

}
