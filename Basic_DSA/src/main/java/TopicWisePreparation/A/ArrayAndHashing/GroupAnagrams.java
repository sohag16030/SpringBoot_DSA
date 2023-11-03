package TopicWisePreparation.A.ArrayAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, Integer> sortedStringsFrequencies = new HashMap<>();
        for (String str : strs) {
            char[] unsorted = str.toCharArray();
            Arrays.sort(unsorted);
            String sorted = new String(unsorted);
            if (!sortedStringsFrequencies.containsKey(sorted))
                sortedStringsFrequencies.put(sorted, 1);
            else sortedStringsFrequencies.put(sorted, sortedStringsFrequencies.get(sorted.toString()) + 1);
        }
    }
}
