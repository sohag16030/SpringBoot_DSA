package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorityElements {
    public static void main(String[] args) {
        int[] nums = {1, 21, 1, 2, 2, 2, 2, 2, 3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Integer[] numbers = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = Integer.valueOf(nums[i]);
        }
        Map<Integer, Long> map = Arrays.stream(numbers).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        Long maxValue = Long.valueOf(0);
        Integer key = 0;
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                key = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        return key;
    }
}
