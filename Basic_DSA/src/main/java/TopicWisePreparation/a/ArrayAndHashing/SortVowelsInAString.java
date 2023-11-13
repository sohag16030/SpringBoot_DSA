package TopicWisePreparation.a.ArrayAndHashing;

import java.util.*;

public class SortVowelsInAString {
    public static void main(String[] args) {
        String s = "lEetcOde";
        String ans = sortVowels(s);
    }

    public static String sortVowels(String s) {
        List<Character> reserved = new ArrayList<>();
        Map<Integer, Boolean> check = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                reserved.add(s.charAt(i));
                check.put(i, true);
            }
        }
        Collections.sort(reserved);

        String output = "";
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (check.containsKey(i)) {
                output += reserved.get(k++);
            } else {
                output += s.charAt(i);
            }
        }
        return output;
    }

}
