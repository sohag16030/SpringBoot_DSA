package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class GreatestCommonDivisorofStrings_1071 {

    public static void main(String[] args) {
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXX";

        String ans = gcdOfStrings(str1, str2);
    }

    private static String gcdOfStrings(String str1, String str2) {
        String max = "";
        Map<String, Boolean> getResult = new HashMap<>();
        String small = str2.length()<str1.length() ? str2 : str1;
        for (int i = 0; i < small.length(); i++) {
            for (int j = i + 1; j <= small.length(); j++) {
                String divisor = small.substring(i, j);
                if (findLargestDivisor(str1, divisor) && findLargestDivisor(str2, divisor)) {
                    if (divisor.length() > max.length()) {
                        max = divisor;
                    }
                }
            }
        }
        System.out.println(max);
        return max;
    }

    private static boolean findLargestDivisor(String str, String divisor) {
        boolean flag = true;
        int incr = divisor.length();
        for (int i = 0; i < str.length(); i += incr) {
            String match = "";
            if (i + incr <= str.length()) {
                match = str.substring(i, i + incr);
            }
            if (!match.equals(divisor)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return true;
        }
        return false;
    }
}
