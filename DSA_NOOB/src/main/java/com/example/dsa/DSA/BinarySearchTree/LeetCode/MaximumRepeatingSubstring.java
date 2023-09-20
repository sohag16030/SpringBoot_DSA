package com.example.dsa.DSA.BinarySearchTree.LeetCode;

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        System.out.println(maxRepeating(sequence, word));
    }

    private static int maxRepeating(String sequence, String word) {
        int l = word.length(), ans = 0, max = 0;
        for (int i = 0; i < sequence.length(); i++) {
            callMethod(sequence, word, i, l, max);
        }
        return ans;
    }

    private static int callMethod(String sequence, String word, int i, int l, int max) {
        int ans = 0;
        while (i < sequence.length()) {
            String sub = null;
            if (i + l <= sequence.length()) {
                sub = sequence.substring(i, i + l);
                //System.out.println(sub);
            }
            if (sub.equalsIgnoreCase(word)) {
                ans++;
                i = i + l;
                //System.out.println(i);
            }
            if (!sub.equalsIgnoreCase(word)) {
                max = Math.max(ans, max);
                ans = 0;
            }
            if (i + l > sequence.length()) {
                max = Math.max(ans, max);
                break;
            }
        }
        System.out.println(max);
        return max;
    }
}
