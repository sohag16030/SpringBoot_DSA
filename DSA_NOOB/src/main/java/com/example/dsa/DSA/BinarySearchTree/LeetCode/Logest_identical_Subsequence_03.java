package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Logest_identical_Subsequence_03 {
    public static void main(String[] args) {
        String s = "abcaabcdba";
        int ans = lengthOfLongestSubstring(s);
    }

    private static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int max = 0;
        int count = 0;
        Map<Character, Integer> seen = new HashMap<>();
        while (i < s.length()) {
            while (i < s.length() && !seen.containsKey(s.charAt(i))) {
                seen.put(s.charAt(i), i);
                count++;
                System.out.println(s.charAt(i) + " " + i);
                i++;
                System.out.println(i);
            }
            max = Math.max(max, count);
            if (i < s.length()) {
                System.out.println(seen.get(s.charAt(i)));
                seen.remove(s.charAt((i)));
                count--;
            }
        }
        return max;
    }
}
