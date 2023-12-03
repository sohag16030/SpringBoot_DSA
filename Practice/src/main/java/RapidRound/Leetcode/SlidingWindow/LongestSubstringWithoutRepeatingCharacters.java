package RapidRound.Leetcode.SlidingWindow;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";
        lengthOfLongestSubstring(s);
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
                System.out.println(s.charAt(i));
                count++;
            } else {
                max = Math.max(max, count);
                int j = map.get(s.charAt(i));
                count = i - j;
                Iterator<Character> iterator = map.keySet().iterator();
                while (iterator.hasNext()) {
                    Character key = iterator.next();
                    if (key.equals(s.charAt(i))) {
                        iterator.remove();
                        break;
                    } else {
                        iterator.remove();
                    }
                }
                map.put(s.charAt(i), i);
            }
        }
        return Math.max(max, count);
    }
}
