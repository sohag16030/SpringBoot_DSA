package TopicWisePreparation.c.TwoPointers;

import java.util.Arrays;

public class TowSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Arrays.sort(nums);
        twoSumFind(nums, 0, nums.length - 1, target);
    }

    private static void twoSumFind(int[] nums, int l, int h, int target) {
        // 2, 7, 11, 15
        //l=0       h=3
        while (l < h) {
            if (nums[l] + nums[h] == target) {
                System.out.println();
                break;
            } else if (nums[l] + nums[h] < target) {
                l = l + 1;
            } else h = h - 1;
        }
    }
}
