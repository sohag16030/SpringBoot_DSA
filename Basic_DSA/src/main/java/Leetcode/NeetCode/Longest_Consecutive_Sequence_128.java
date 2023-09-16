package Leetcode.NeetCode;

import java.util.*;

public class Longest_Consecutive_Sequence_128 {
    public static void main(String[] args) {
        int[] nums = {};
        int ans = longestConsecutive(nums);
    }

    private static int longestConsecutive(int[] nums) {
        SortedSet<Integer> mySet = new TreeSet<>();
        for (Integer i : nums) {
            mySet.add(i);
        }
        List<Integer> list = new ArrayList<>(mySet);
        List<Integer> ansList = new ArrayList<>();
        if (list.size() == 0) return 0;
        int count = 1;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) == 1) {
                count++;
            } else {
                ansList.add(count);
                count = 1;
            }
        }
        ansList.add(count);
        Collections.sort(ansList);
        return ansList.get(ansList.size() - 1);
    }
}
