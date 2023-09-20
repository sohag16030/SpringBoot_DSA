package com.example.dsa.DSA.BinarySearchTree.LeetCode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {4};
        int target = 4;
        int index = search(nums, target);
        System.out.println(index);
    }

    private static int search(int[] nums, int target) {
        int l = 0, u = nums.length - 1;
        while (l <= u) {
            int mid = l + ((u - l) / 2);
            if (nums[mid] == target) return mid;
            else if (target < nums[mid])
                u = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }

}
