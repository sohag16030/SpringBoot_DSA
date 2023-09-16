package Leetcode.NeetCode;

import java.util.Arrays;
import java.util.List;

public class SecondMaxFinding {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20,1);
        secondMaxFind(list);
    }

    static int max = -1;

    private static void secondMaxFind(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num < max && num > secondMax) {
                secondMax = num;
            }
        }
    }
}
