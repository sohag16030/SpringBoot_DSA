package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.Arrays;

public class TwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {15, 20, 35, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 23, 24};
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int cont = m + n;
        for (int i = n - 1; i >= 0; i--) {
            cont--;
            nums1[cont] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
