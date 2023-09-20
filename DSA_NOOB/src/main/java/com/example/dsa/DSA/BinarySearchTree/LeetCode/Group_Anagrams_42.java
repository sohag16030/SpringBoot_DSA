package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.*;

public class Group_Anagrams_42 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = groupAnagrams(strs);
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> checkMap = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            List<String> data = checkMap.get(sorted);
            if (data!=null)
                data.add(str);
            else {
                data = new ArrayList<>();
                data.add(str);
            }
            checkMap.put(sorted, data);
        }
        List<List<String>> list = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : checkMap.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }
}
