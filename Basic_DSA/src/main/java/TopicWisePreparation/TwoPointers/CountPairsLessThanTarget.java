package TopicWisePreparation.TwoPointers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountPairsLessThanTarget {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(-7);
        nums.add(-6);
        nums.add(-2);
        nums.add(-1);
        nums.add(2);
        nums.add(3);
        nums.add(5);
        int target = -2;
        int ans = countPairs(nums, target);
        System.out.println(ans);
    }

    public static int countPairs(List<Integer> nums, int target) {
        List<Integer> sortedNums = nums.stream().sorted().collect(Collectors.toList());
        int count = 0;
        for (int i = 0; i < sortedNums.size(); i++) {
            int l = i, h = sortedNums.size() - 1;
            while (l < h) {
                if (sortedNums.get(l) + sortedNums.get(h) < target) {
                    count += h - l;
                    break;
                } else
                    h--;
            }
        }
        return count;
    }
}
