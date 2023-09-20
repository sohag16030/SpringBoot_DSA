package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1 && nums[0] - 1 >= 0) return nums[0] - 1;
        if (nums.length == 1) return nums[0] + 1;
        if (nums.length == 1 && nums[0] != 0) return nums[0] - 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > 1)
                return nums[i] + 1;
        }
        if (nums[0] - 1 >= 0) return nums[0] - 1;
        else return nums[nums.length - 1] + 1;
    }
}
