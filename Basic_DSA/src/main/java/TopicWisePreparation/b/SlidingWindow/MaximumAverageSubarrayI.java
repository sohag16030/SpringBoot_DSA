package TopicWisePreparation.b.SlidingWindow;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        //int[] nums = {1, 12, -5, -6, 50, 3};
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;
        findMaxAverage(nums, k);
    }

    public static double findMaxAverage(int[] nums, int k) {
        int temp = 0, sum = 0;
        while (temp < k) {
            sum += nums[temp];
            temp++;
        }
        double max = Integer.MIN_VALUE;
        for (int i = 1; i <= nums.length - k; i++) {
            System.out.println(sum);
            System.out.println(nums[i + k - 1]);
            System.out.println(nums[i - 1]);
            sum = sum + nums[i + k - 1] - nums[i - 1];
            System.out.println(sum);
            double result = (double) sum / k;
            max = Math.max(max, result);
        }
        return max;
    }
}
