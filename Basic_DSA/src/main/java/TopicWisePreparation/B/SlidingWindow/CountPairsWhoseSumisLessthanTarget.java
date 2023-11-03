package TopicWisePreparation.B.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface CountPairsWhoseSumisLessthanTarget {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        int target = 2;
        countPairs(nums, target);
    }

    public static int countPairs(List<Integer> nums, int target) {
        int[] numArray = new int[nums.size()];
        int i = 0;
        int count = 0;
        for (int val : nums) numArray[i++] = val;
        int[] sortedNums = Arrays.stream(numArray).sorted().toArray();
        int l = 0, h = sortedNums.length - 1;

        while (l < h) {
            if (sortedNums[l] + sortedNums[h] < target) {
                count++;
                System.out.println(l + " " + h);
                l = l + 1;
            } else
                h = h - 1;
        }
        return count;
    }
}
