package TopicWisePreparation.A.ArrayAndHashing;

public class RotateArray {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        int k = 3;
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        if (k % nums.length > 0) {
            k = k % nums.length;
            int finalMid = nums.length / 2;
            int lf = 0, hf = nums.length - 1;
            while (finalMid > 0) {
                int temp = nums[lf];
                nums[lf] = nums[hf];
                nums[hf] = temp;
                lf++;
                hf--;
                finalMid--;
            }

            int firstMid = k / 2, l = 0, h = k - 1;
            while (firstMid > 0) {
                int temp = nums[l];
                nums[l] = nums[h];
                nums[h] = temp;
                l++;
                h--;
                firstMid--;
            }
            int secondMid = (nums.length - k) / 2, low = k, high = nums.length - 1;
            while (secondMid > 0) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
                secondMid--;
            }
        }
    }
}
