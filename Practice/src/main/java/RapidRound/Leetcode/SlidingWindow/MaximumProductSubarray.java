package RapidRound.Leetcode.SlidingWindow;

public class MaximumProductSubarray {
    private static int leftProduct;

    public static void main(String[] args) {
        int[] nums = {-3, -2};
        maxProduct(nums);
    }

    public static int maxProduct(int[] nums) {
        int ans = nums[0];
        int l = 0, r = nums.length - 1;
        int leftProduct = 1, rightProduct = 1;
        while (l <= nums.length - 1 && r >= 0) {
            if (leftProduct == 0) leftProduct = 1;
            if (rightProduct == 0) rightProduct = 1;
            leftProduct = leftProduct * nums[l];
            rightProduct = rightProduct * nums[r];
            l++;
            r--;
            ans = (Math.max(ans, Math.max(leftProduct, rightProduct)));
        }
        return ans;
    }
}
