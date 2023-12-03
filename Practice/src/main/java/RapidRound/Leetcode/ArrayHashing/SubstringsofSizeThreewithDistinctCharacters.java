package RapidRound.Leetcode.ArrayHashing;

import java.util.HashSet;
import java.util.Set;

public class SubstringsofSizeThreewithDistinctCharacters {
    public static void main(String[] args) {
        String s = "xyzzaz";
        int ans = countGoodSubstrings(s);
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i + 3 < s.length(); i++) {
            String subStr = s.substring(i, i + 3);
            boolean distinct = checkSubStrDistinct(subStr);
            System.out.println(subStr);
            if (distinct)
                count++;
        }
        return count;
    }

    private static boolean checkSubStrDistinct(String subStr) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < subStr.length(); i++) {
            set.add(subStr.charAt(i));
        }
        if (set.size() == 3) return true;
        else return false;
    }
}
