package com.example.dsa.AdvanceJava;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionFramework {
    public static void main(String[] args) {
        Map<String, String> mymap = new HashMap<>();
        mymap.put("One", "Bangladesh");
        mymap.put("Two", "India");
        mymap.put("Three", "China");

        for (String key : mymap.keySet()) {
            System.out.println(key);
        }
        for (Map.Entry<String, String> entry : mymap.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }

        List<Integer> mylist = new ArrayList<>(List.of(1, 2, 2, 3, 3, 4, 4));
        int[] nums = new int[mylist.size()];

        //array elements sum using stream api
//        int sum = Arrays.stream(nums).sum();
//        int oddSum = Arrays.stream(nums).filter(i -> i % 2 == 0).sum();
//        System.out.println(sum);

        String s = "lletcode";
        String str = "lletcode";
 //      List<Integer> arr = Arrays.asList(10, 12, 12);
//        Map<Integer, Long> map = arr.stream()
//                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
//        Map<Character, Long> map1 = str.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        int[] arr = {10,20,30};
        int sum = Arrays.stream(arr).sum();
    }
}
