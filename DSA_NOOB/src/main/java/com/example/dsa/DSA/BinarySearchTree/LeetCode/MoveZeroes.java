package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {-58305, -22022, 0, 0, 0, 0, 0, -76070, 42820, 48119, 0, 95708, -91393, 60044, 0, -34562, 0, -88974};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        TreeMap<Integer, Integer> store = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                store.put(i, nums[i]);
        }
        int j = 0;
        for (Map.Entry<Integer, Integer> entry : store.entrySet()) {
            nums[j++] = entry.getValue();
        }
        for (int k = store.size(); k < nums.length; k++) {
            nums[k] = 0;
        }
        System.out.println(nums);
    }
}
