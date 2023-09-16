package Leetcode.NeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class Top_K_Frequent_Elements_347 {
    public static void main(String[] args) {
        int[] nums = {4,1,-1,2,-1,2,3};
        int k = 2;
        System.out.println(topKFrequent(nums, k));
    }

    private static int[] topKFrequent(int[] nums, int k) {
        List<Integer> num = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Map<Integer, Long> frequencyMap = num.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        List<Map.Entry<Integer, Long>> list = new LinkedList<>(frequencyMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Long>>() {
            @Override
            public int compare(Map.Entry<Integer, Long> o1, Map.Entry<Integer, Long> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        Map<Integer, Long> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Long> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        for (Map.Entry<Integer, Long> entry : sortedMap.entrySet()) {
            if (i == k)
                break;
            else {
                i++;
                ans.add(entry.getKey());
            }
        }
        int[] arr = ans.stream().mapToInt(j -> j).toArray();
        return arr;
    }
}
