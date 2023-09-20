package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.stream.Collectors;

public class Valid_Palindrome_125 {
    public static void main(String[] args) {
        String s = "";
        boolean ans = isPalindrome(s);
    }

    private static boolean isPalindrome(String s) {
       String output = s.chars().filter(Character::isLetterOrDigit)
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining()).toLowerCase();

        StringBuilder outputbuilder = new StringBuilder(output);
        String reversed = outputbuilder.reverse().toString();
        return output.equals(reversed);
    }
}
