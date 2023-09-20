package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class Three_Sum_15 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = threeSum(nums);
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> num = Arrays.stream(nums).boxed().collect(Collectors.toList());
        var ansMap = new HashMap<>();
        for (int i = 0; i < num.size(); i++) {
            ansMap.put(i, num.get(i));
        }
        for (int i = 0; i < num.size(); i++) {
            List<Integer> processList = new ArrayList<>();
            int temp = 0;
            for (int j = 0; j < num.size(); j++) {
                if (j != i)
                    processList.add(num.get(j));
                else
                    temp = num.get(i);
            }
            int low = 0, high = processList.size() - 1;
            Set<String> seen = new HashSet<>();
            while (low < high) {
                if (processList.get(low) + processList.get(high) == -temp) {
                    String unique = temp + processList.get(low) + processList.get(high) + "";
                    Arrays.sort(unique.toCharArray());
                    if (seen.add(unique)) {
                        ans.add(Arrays.asList(i, low, high));
                        break;
                    }
                } else if (processList.get(low) + processList.get(high) > -temp)
                    high -= 1;
                else
                    low += 1;
            }
        }
        return ans;
    }
}
