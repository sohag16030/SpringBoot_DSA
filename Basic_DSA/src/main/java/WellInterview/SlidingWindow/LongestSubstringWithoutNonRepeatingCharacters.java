package WellInterview.SlidingWindow;

import java.util.*;

public class LongestSubstringWithoutNonRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcdbcdefghijklmn";
        int l = 0, h = 0, max = 0;
        Map<Character, Integer> seen = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!seen.containsKey(ch)) {
                seen.put(ch, i);
                h++;
            } else {
                max = Math.max(max, h - l);
                l = seen.get(ch);
                i = l;
                h = l;
                seen.clear();
            }

        }
        max = Math.max(max, h - l);
        System.out.println(max);
    }
}
