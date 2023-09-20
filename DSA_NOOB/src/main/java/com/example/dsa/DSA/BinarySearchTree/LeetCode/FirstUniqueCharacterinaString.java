package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.net.Inet4Address;
import java.util.*;
import java.util.stream.Collectors;

public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("ee"));
    }

    public static int firstUniqChar(String s) {
        LinkedHashMap<Character,Boolean> map = new LinkedHashMap<>();
        LinkedHashMap<Character,Integer> index = new LinkedHashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),true);
                index.put(s.charAt(i),i);
            }else{
                map.put(s.charAt(i),false);
            }
        }
        for(Map.Entry<Character,Boolean> entry : map.entrySet()){
            if(entry.getValue()){
                return index.get(entry.getKey());
            }
        }
        return -1;
    }

}
