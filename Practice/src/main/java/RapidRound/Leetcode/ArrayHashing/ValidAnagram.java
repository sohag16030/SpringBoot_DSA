package RapidRound.Leetcode.ArrayHashing;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            char[] sChars = s.toCharArray();
            Arrays.sort(sChars);
            char[] tChars = t.toCharArray();
            Arrays.sort(tChars);
            String str = "";
            for (char ch : sChars) {
                str += ch;
            }
            String tr = "";
            for (char ch : tChars) {
                tr += ch;
            }
            return str.equalsIgnoreCase(tr) ? true : false;
        } else return false;

    }
}
