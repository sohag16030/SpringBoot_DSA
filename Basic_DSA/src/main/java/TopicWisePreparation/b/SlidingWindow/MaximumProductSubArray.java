package TopicWisePreparation.b.SlidingWindow;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        // 2,3,-1,-2,4,5,-3,5,6,1

        // all positive just multiply
        // jodi negative number are even count....then just multiply
        // jodi odd count hoi thole j kono ek side theke ekta negative num er agr pojonto ans. eta forward hote pare , abr back direction thekeo hote pare..
        // jodi 0 theke thole 0 hole 1 dia shuru korte hbe.. number of 0 , number o partition..
        // 2,3,-1,-10,0,1,-1,5,6,1

        // 2,3,4,5,6,1,1
        // 2,1,-3,5,6,-1,6
        // 2,1,-3,5,-4,6,-1,6
        //int[] nums = {2, 1, -3, 5, 0, -4, 6, -1, 6};
        int[] nums = {0};

        int leftRes = 1, rightRes = 1;
        int l = 0, h = nums.length - 1;
        int max = Integer.MIN_VALUE;
        while (l < nums.length && h >= 0) {
            if (nums[l] == 0) {
                leftRes = 1;
                max = Math.max(max, 0);
                l++;
            } else if (nums[h] == 0) {
                rightRes = 1;
                max = Math.max(max, 0);
                h--;
            } else {
                leftRes = leftRes * nums[l];
                rightRes = rightRes * nums[h];
                l++;
                h--;

                max = Math.max(max, Math.max(leftRes, rightRes));
            }
        }

    }
}
