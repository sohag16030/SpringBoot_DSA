package RapidRound.Leetcode.TwoPointers;

import org.springframework.boot.web.reactive.context.StandardReactiveWebEnvironment;

import java.util.Arrays;
import java.util.List;

public class CountPairsWhoseSumisLessthanTarget {
    public static void main(String[] args) {
        int[] nums = {-1,1,2,3,1};
        int target = 2;
        countPairs(nums, target);
    }

    public static int countPairs(int[] nums, int target) {
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        int count = 0;
        for (int i = 0; i < sortedNums.length; i++) {
            int h = sortedNums.length - 1;
            while (i < h) {
                if (sortedNums[i] + sortedNums[h] >= target) h--;
                else {
                    count += (h - i);
                    break;
                }
            }
            System.out.println(h);
        }
        return count;
    }
}
