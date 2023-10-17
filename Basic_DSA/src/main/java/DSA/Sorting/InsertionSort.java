package DSA.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {11, 4, 6, 2, 10, 3};
        // insertion sort used subarray sorting approach
        // step 1 : take first two elements and sort them asc order..
        // 4,11,6,2,10,3
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
            for (int val : nums)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
