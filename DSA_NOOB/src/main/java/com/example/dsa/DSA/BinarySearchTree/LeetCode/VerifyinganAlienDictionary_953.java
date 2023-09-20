package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.LinkedHashMap;

public class VerifyinganAlienDictionary_953 {

    public static void main(String[] args) {
        String[] words = {"fxasxpc","dfbdrifhp","nwzgs","cmwqriv","ebulyfyve","miracx","sxckdwzv","dtijzluhts","wwbmnge","qmjwymmyox"};
        String order = "zkgwaverfimqxbnctdplsjyohu";
        System.out.println(isAlienSorted(words, order));
    }

    private static boolean isAlienSorted(String[] words, String order) {
        LinkedHashMap<Character, Integer> dic = new LinkedHashMap<>();
        int cnt = 1;
        for (Character ch : order.toCharArray()) {
            dic.put(ch, cnt++);
        }
        boolean flag = true;
        for (int i = 0; i < words.length - 1; i++) {
            System.out.println(words[i]);
            System.out.println(words[i + 1]);
            String firstWord = words[i];
            String secondWord = words[i + 1];
            int j = 0;
            int rotate = Math.min(words[i].length(), words[i + 1].length());
            int sameChar = 0;
            while (j < rotate) {
                System.out.println(firstWord.charAt(j));
                System.out.println(secondWord.charAt(j));
                System.out.println(dic.get(firstWord.charAt(j)));
                System.out.println(dic.get(secondWord.charAt(j)));

                if (dic.get(firstWord.charAt(j)) < dic.get(secondWord.charAt(j))) {
                    break;
                } else if (dic.get(firstWord.charAt(j)) > dic.get(secondWord.charAt(j))) {
                    flag = false;
                    break;
                } else if (dic.get(firstWord.charAt(j)) == dic.get(secondWord.charAt(j))) {
                    sameChar ++;
                }
                j++;
            }
            if(sameChar == rotate){
               flag = firstWord.length() <= secondWord.length();
            }
            if (!flag) {
                break;
            }
        }
        return flag;
    }
}
