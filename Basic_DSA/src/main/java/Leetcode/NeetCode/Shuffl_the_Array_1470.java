package Leetcode.NeetCode;

public class Shuffl_the_Array_1470 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        int[] ans = shuffle(nums, n);
    }

    private static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n * 2];
        int count = 0;
        int i = 0;int j = 0;
        while (count < n) {
            System.out.print(nums[i]);
            System.out.print(nums[i+n]);
            ans[j] = nums[i];
            ans[j+1] = nums[i+n];
            i++;j+=2;
            count++;
        }
        return ans;
    }
}
