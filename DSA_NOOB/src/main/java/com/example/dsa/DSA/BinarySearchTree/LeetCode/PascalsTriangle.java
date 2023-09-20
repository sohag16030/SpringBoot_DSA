package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> ans = generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalesTriangle = new ArrayList<>();

        pascalesTriangle.add(new ArrayList<>(List.of(1)));
        if (numRows == 1) return pascalesTriangle;
        pascalesTriangle.add(new ArrayList<>(List.of(1, 1)));
        if (numRows == 2) return pascalesTriangle;

        for (int i = 2; i <= numRows; i++) {
            List<Integer> tempPrevTriangle = new ArrayList<>();
            tempPrevTriangle = pascalesTriangle.get(i - 1);
            Deque<Integer> currentTriangle = new ArrayDeque<>();
            for (int j = 0; j < tempPrevTriangle.size() - 1; j++) {
                currentTriangle.add(tempPrevTriangle.get(j) + tempPrevTriangle.get(j + 1));
            }
            currentTriangle.addFirst(1);
            currentTriangle.addLast(1);
            List<Integer> convertedTriangle = new ArrayList<>(currentTriangle);
            pascalesTriangle.add(convertedTriangle);
        }
        return pascalesTriangle;

    }
}
