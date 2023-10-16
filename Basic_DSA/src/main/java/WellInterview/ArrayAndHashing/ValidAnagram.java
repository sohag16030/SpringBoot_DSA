package WellInterview.ArrayAndHashing;

import java.util.Map;
import java.util.stream.Collectors;

public class ValidAnagram {
    public static void main(String[] args) {
        String str = "anagrama";
        String str2 = "agramnaa";
        if (str.length()!=str2.length())
            System.out.println("Not Anagram");
        else{
            Map<Character, Long> strFrequency = str.chars()
                    .mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
            for (int i = 0; i < str2.length(); i++) {
                Character c = str2.charAt(i);
                if (strFrequency.containsKey(c) && strFrequency.get(c) > 0) {
                    strFrequency.put(c, strFrequency.get(c) - 1);
                    if (strFrequency.get(c) == 0)
                        strFrequency.remove(c);
                }
            }
            if (strFrequency.size() > 0) System.out.println("Not Anagram");
            else System.out.println("Anagram");
        }

    }
}
