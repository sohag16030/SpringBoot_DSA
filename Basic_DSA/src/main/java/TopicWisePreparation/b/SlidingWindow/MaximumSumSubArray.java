package TopicWisePreparation.b.SlidingWindow;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] nums = {2, 1, -10, 5, 0, -4, 6, -1, 6};

        int max = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            if (curr < 0) {
                curr = 0;
            } else
                max = Math.max(max, curr);
        }
    }
}
