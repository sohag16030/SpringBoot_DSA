package com.example.dsa.DSA.Recursion;

import java.util.Arrays;
import java.util.List;

public class ReverseOrderPrint {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,11,12);
        reverseOrderPrint(arr,3);
    }

    private static void reverseOrderPrint(List<Integer> arr,int n) {
        if(n==0) return;
        System.out.println(arr.get(n-1));
        reverseOrderPrint(arr,n-1);

    }
}
