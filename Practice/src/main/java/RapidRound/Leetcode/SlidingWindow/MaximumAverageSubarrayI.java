package RapidRound.Leetcode.SlidingWindow;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        //int[] nums = {1, 12, -5, -6, 50, 3};
        int[] nums = {4, 0, 4, 3, 3};
        int k = 5;
        double ans = findMaxAverage(nums, k);
    }

    public static double findMaxAverage(int[] nums, int k) {
        int fsum = 0;
        for (int i = 0; i < k; i++) {
            fsum += nums[i];
        }
        System.out.println(fsum);
        double maxAvg =(double) fsum / k;
        int nextSum = 0, j = k, prev = 0;
        for (int i = 1; i <= nums.length - k; i++) {
            nextSum = fsum + nums[j] - nums[prev];
            j++;
            prev++;
            maxAvg = Math.max(maxAvg, (double) nextSum / k);
            fsum = nextSum;
            System.out.println(nextSum);
        }
        return maxAvg;
    }
}
