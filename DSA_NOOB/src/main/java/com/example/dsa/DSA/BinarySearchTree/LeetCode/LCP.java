package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.HashSet;

public class LCP {
    public static void main(String[] args) {
        String[] strs = {"ftower", "flow", "flight"};
        String ans = longestCommonPrefix(strs);
    }

    private static String longestCommonPrefix(String[] strs) {
        int cnt = 0, min = Integer.MAX_VALUE;
        while (cnt < strs.length) {
            min = Math.min(min, strs[cnt].length());
            cnt++;
        }
        int itr = 0;
        String ans = "";
        for (int i = 0; i < min; i++) {
            HashSet<String> sameCheck = new HashSet<>();
            String s = null;

            Boolean flag = true;

            while (itr < strs.length) {
                s = strs[itr].substring(0, i + 1);
                if (!sameCheck.add(s)) {
                    System.out.println(s);
                } else if (itr != 0) {
                    flag = false;
                    break;
                }
                itr++;
            }
            if (!flag) {
                return ans;
            } else if (sameCheck.size() == 1) {
                ans = s;
                System.out.println(s);
            }
            itr = 0;
        }
        return ans;
    }
}
