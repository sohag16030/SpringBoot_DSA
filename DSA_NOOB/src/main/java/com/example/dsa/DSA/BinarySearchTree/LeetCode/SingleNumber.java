package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 2, 3};

        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        Map<Integer, Integer> mymap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!mymap.containsKey(nums[i])) {
                mymap.put(nums[i], 1);
            } else {
                mymap.put(nums[i], mymap.get(nums[i]) + 1);
            }
        }
        Map<Integer, Integer> filteredMap = mymap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));

        return filteredMap.keySet().iterator().next();
    }
}
