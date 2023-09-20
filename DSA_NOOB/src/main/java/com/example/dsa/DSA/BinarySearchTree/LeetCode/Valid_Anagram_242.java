package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.Arrays;

public class Valid_Anagram_242 {
    private static boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sortedStringS = new String(charArray);
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray2);
        String sortedStringT = new String(charArray2);
        return sortedStringS.equalsIgnoreCase(sortedStringT) ? true : false;
    }

    public static void main(String[] args) {
        String s = "a", t = "ab";
        System.out.println(isAnagram(s, t));
    }


}
