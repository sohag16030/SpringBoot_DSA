package Leetcode.NeetCode;

import java.util.*;

public class Find_All_Anagrams_in_a_String_438 {
    public static void main(String[] args) {
        String s = "ababc";
        String p = "abc";
        List<Integer> ans = findAnagrams(s, p);
    }

    private static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        if (s.length() < p.length()) {
            return res;
        }
        int[] ct1 = new int[26];
        int[] ct2 = new int[26];

        int k = p.length();

        for (char it : p.toCharArray()) {
            ct1[it - 'a']++;
        }
        int i = 0;
        while (i < k) {
            ct2[s.charAt(i++) - 'a']++;
        }
        if (Arrays.equals(ct1, ct2)) res.add(0);
        int j =0;
        while (i < s.length()) {
            ct2[s.charAt(j++) - 'a']--;
            ct2[s.charAt(i++) - 'a']++;
            if (Arrays.equals(ct1, ct2))
                res.add(j);
        }
        return res;
    }
}
