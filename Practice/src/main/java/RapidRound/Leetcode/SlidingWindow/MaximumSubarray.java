package RapidRound.Leetcode.SlidingWindow;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,-1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for (int num : nums) {
            currSum += num;
            max = Math.max(currSum, max);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return max;
    }
}
