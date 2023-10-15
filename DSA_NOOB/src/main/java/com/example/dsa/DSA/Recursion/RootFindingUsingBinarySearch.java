package com.example.dsa.DSA.Recursion;

public class RootFindingUsingBinarySearch {
    public static void main(String[] args) {
        int ans = rootFindingBinarysearch(1, 8, 9);
    }

    private static int rootFindingBinarysearch(int l, int u, int v) {
        int mid = l + (u - l) / 2;
        if (mid * mid == v) return mid;
        else if (mid * mid > v) {
          return rootFindingBinarysearch(l, mid - 1, v); // boro k komabo..
        } else if  (mid * mid < v) return rootFindingBinarysearch(mid + 1, u, v); // choto k barabo..
        return 0;
    }
}
