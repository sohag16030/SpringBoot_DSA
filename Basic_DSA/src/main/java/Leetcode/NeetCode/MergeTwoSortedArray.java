package Leetcode.NeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 13, 14, 15);
        List<Integer> list2 = Arrays.asList(10, 11, 12);
        List<Integer> list = new ArrayList<>();
        int l1 = list1.size();
        int l2 = list2.size();
        int i = 0;
        int j = 0;
        while (i < l1 && j < l2) {
            if (list1.get(i) < list2.get(j)) {
                list.add(list1.get(i));
                i++;
            } else {
                list.add(list2.get(j));
                j++;
            }
        }
        System.out.println(i + "" + j);
        while (i < l1) {
            list.add(list1.get(i));
            i++;
        }
        while (j < l2) {
            list.add(list2.get(j));
            j++;
        }
        System.out.println(list);
    }
}
