package com.example.dsa.DSA.BinarySearchTree.LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Contains_Duplicate_217 {
    public static boolean containsDuplicate(int[] nums) {
        Integer[] integerArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        List<Integer> list = Arrays.asList(integerArray);
        Map<Integer,Long> frequencyMap = list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));

       Long val = frequencyMap.entrySet().stream()
                .filter(e -> e.getValue() == 1).count();
        if(val == nums.length)  return true ;
        else return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(containsDuplicate(arr));
    }
}
