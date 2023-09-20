package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.Iterator;
import java.util.LinkedList;

public class ZigzagConversion_06 {
    public static void main(String[] args) {
        String s = "AB";
        int numRows = 2;
        String ans = Convert(s, numRows);
    }


    private static String Convert(String s, int numRows) {
        LinkedList<Character> adj[] = new LinkedList[numRows];
        //adj[0].add(new ArrayList<>());
        for (int k = 0; k < numRows; k++) {
            adj[k] = new LinkedList<>();
        }
        boolean flag = false;
        int l = 0;
        while (l < s.length()) {
            int start = 0;
            while (start < numRows) {
                //System.out.println("l::" + l + " " + s.charAt(l) + " " + start + " ");
                adj[start].add(s.charAt(l));
                start++;
                l++;
                if (l == s.length()) {
                    flag = true;
                    break;
                }
            }
            if (flag) break;
            int againStart = numRows - 2;
            while (againStart > 0) {
                // System.out.println("l::" + l + " " + s.charAt(l) + " " + againStart + " ");
                adj[againStart].add(s.charAt(l));
                againStart--;
                l++;
                if (l == s.length()) {
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }
        String str = new String();
        for (int i = 0; i < numRows; i++) {
            Iterator it = adj[i].listIterator();
            while (it.hasNext()) {
                 str += it.next().toString();
            }
        }
        System.out.println(str);
        return str;
    }
}
