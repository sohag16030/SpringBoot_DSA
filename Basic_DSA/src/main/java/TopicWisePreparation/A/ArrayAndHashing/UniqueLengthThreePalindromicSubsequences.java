package TopicWisePreparation.A.ArrayAndHashing;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class Pair<K, V> {
    public K key;
    public V value;
}

public class UniqueLengthThreePalindromicSubsequences {
    public static void main(String[] args) {
        String s = "bbcbaba";
        System.out.println(countPalindromicSubsequence(s));
    }

    public static int countPalindromicSubsequence(String s) {
        Map<Character, Pair<Integer, Integer>> charIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!charIndex.containsKey(s.charAt(i))) {
                Pair<Integer, Integer> pair = new Pair<>();
                pair.key = i;
                charIndex.put(s.charAt(i), pair);
            } else {
                Pair<Integer, Integer> pair = charIndex.get(s.charAt(i));
                pair.value = i;
                charIndex.put(s.charAt(i), pair);
            }
        }

        Set<String> unique = new HashSet<>();
        charIndex.forEach((key, value) -> {
            if (value.value != null) {
                System.out.println(key + " " + value.key + " " + value.value);
                Set<Character> checked = new HashSet<>();
                for (int k = value.key + 1; k < value.value; k++) {
                    if (!checked.contains(s.charAt(k))) {
                        checked.add(s.charAt(k));
                        System.out.println(s.charAt(k));
                        String str = findUniquePalindrome(key, s.charAt(k));
                        unique.add(str);
                    }
                }
            }
        });
        return unique.size();
    }

    private static String findUniquePalindrome(Character key, char ch) {
        char[] palindrome = new char[3];
        palindrome[0] = key;
        palindrome[1] = key;
        palindrome[2] = ch;
        Arrays.sort(palindrome);
        String str = new String(palindrome);
        return str;
    }
}
