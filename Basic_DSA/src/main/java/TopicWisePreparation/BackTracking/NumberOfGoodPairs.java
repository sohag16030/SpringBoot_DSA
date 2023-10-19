package TopicWisePreparation.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        Integer[] num = new Integer[nums.length];
        for (int i = 0; i < num.length; i++) nums[i] = num[i];
        Map<Integer, Long> freq = Arrays.stream(num).collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        List<Integer> input = new ArrayList<>();
        int count = 0;
        for (Integer val : freq.keySet()) {
           count+=(val*(val-1))/2;
        }

        return count;
    }


}
