package Leetcode.NeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_3 {
    public static void main(String[] args) {
        String s = "dvdf";
        int ans = lengthOfLongestSubstring(s);
    }

    private static int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int count = 0;
        int max =0;
        for (int i =0;i<s.length();i++) {
            int j =i;
            if (seen.add(s.charAt(j++))) {
                count++;
                System.out.println("yes::" + s.charAt(j++));
                max = Math.max(max,count);
            } else {
                seen = new HashSet<>();
                seen.add(s.charAt(j++));
                max = Math.max(max,count);
                count = 1;

            }
        }
        return max;
    }
}
