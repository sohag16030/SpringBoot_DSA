package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(9, 14, 15, 16);
        List<Integer> l2 = Arrays.asList(1, 16, 30);

        //Solution using 3rd array
        List<Integer> l3 = new ArrayList<>();
        int s1 = l1.size(), s2 = l2.size();
        int i = 0, j = 0;

        while (i < s1 && j < s2) {
            if (l1.get(i) < l2.get(j)) {
                l3.add(l1.get(i));
                i++;
            } else if (l1.get(i) >= l2.get(j)) {
                l3.add(l2.get(j));
                j++;
            } else
                break;
        }
        if (i < s1) {
            while (i < s1) {
                l3.add(l1.get(i));
                i++;
            }
        } else if (j < s2) {
            while (j < s2) {
                l3.add(l2.get(j));
                j++;
            }
        }
        System.out.println(l3);
    }
}
