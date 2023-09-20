package com.example.dsa.DSA.GraphPractice;

import java.util.ArrayList;
import java.util.List;

public class BackTracking {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> resultList = new ArrayList<>();
        backTack(resultList, new ArrayList<>(), nums);
        System.out.println(resultList);
    }

    public static void backTack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] num) {
        if (tempList.size() == num.length) {
            return;
        }
        for (Integer number : num) {
            if (tempList.contains(number)) continue;
            tempList.add(number);
            backTack(resultList, tempList, num);
            System.out.println(tempList);
            tempList.remove(tempList.size() - 1);
        }
    }
}
