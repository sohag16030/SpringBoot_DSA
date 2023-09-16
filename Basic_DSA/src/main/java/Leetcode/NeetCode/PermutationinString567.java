package Leetcode.NeetCode;

import java.util.Arrays;

public class PermutationinString567 {
    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        boolean ans = checkInclusion(s1, s2);
    }

    private static boolean checkInclusion(String s1, String s2) {
        int l = s1.length();
        char[] str1 = s1.toCharArray();
        Arrays.sort(str1);
        String reserveS1 = new String(str1);
        int l2 = s2.length();
        for (int i = 0; i < l2; i++) {
            String part = null;
            if (i + l <= l2){
                part = s2.substring(i, i + l);
                System.out.println(part);
                char[] partChar = part.toCharArray();
                Arrays.sort(partChar);
                String partStr = new String(partChar);
                if(partStr.equals(reserveS1))
                    return true;
            }
        }
        return false;
    }
}
