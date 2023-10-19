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

    public static int numIdenticalPairs(int[] num) {
        Integer[] nums = new Integer[num.length];
        for (int i = 0; i < num.length; i++) nums[i] = num[i];
        Map<Integer, Long> freq = Arrays.stream(nums).collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        List<Integer> input = new ArrayList<>();
        for (Integer val : freq.keySet()) {
            input.add(val);
        }
        int count = 0;
        List<List<Integer>> resultList = new ArrayList<>();
        combination(input, new ArrayList<Integer>(),resultList,  0, 0);
        System.out.println(resultList);
        return resultList.size();
    }

    private static void combination(List<Integer> input, ArrayList<Integer> current,List<List<Integer>> resultList , int start, int count) {
        if (current.size() == 2) resultList.add(new ArrayList<>(current));
        for (int i = start; i < input.size(); i++) {
            current.add(input.get(i));
            combination(input, current,resultList, i + 1, count);
            current.remove(current.size() - 1);
        }
    }


}
