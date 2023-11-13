package TopicWisePreparation.C.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSumClosest {
    public static void main(String[] args) {
        //int[] nums = {-1, 2, 1, -4};
        int[] nums = {0, 0, 0};
        int target = 1;
        System.out.println( threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        int minDifference = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < sortedNums.length; i++) {
            int l = i + 1, h = sortedNums.length - 1;
            while (l < h) {
                int sum = sortedNums[i] + sortedNums[l] + sortedNums[h];
                if (Math.abs(target - sum) < minDifference) {
                    minDifference = Math.abs(target - sum);
                    ans = sum;
                }
                if (sum == target) {
                    return target;
                } else if (sum > target)
                    h--;
                else
                    l++;
            }
        }
        return ans;
    }
}
