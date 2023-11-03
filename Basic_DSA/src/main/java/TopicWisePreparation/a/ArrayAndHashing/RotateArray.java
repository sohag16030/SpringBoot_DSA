package TopicWisePreparation.a.ArrayAndHashing;

public class RotateArray {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        int k = 3;
        int[] nums = {-1, -100, 3, 99};
        int k = 3;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        int firstMid = (nums.length - k) / 2, l = 0, h = 0;
        if (nums.length % 2 == 0) h = (nums.length - k);
        else h = (nums.length - k) - 1;
        while (firstMid > 0) {
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp;
            l++;
            h--;
            firstMid--;
        }
        int secondMid = k / 2, low = 0, high = nums.length - 1;
        if (nums.length % 2 == 0) low = (nums.length - k) + 1;
        else low = (nums.length - k);
        while (secondMid > 0) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
            secondMid--;
        }
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
    }
}
