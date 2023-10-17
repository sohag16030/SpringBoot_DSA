package DSA.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {11, 4, 6, 2, 10, 3};
        // need to find out the min value index by  right side traversing
        // replace min index value with starting non updated element
        // step 1 : minIdx = 3(value 2)
        // 2,40,6,11,10,30

        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIdx])
                    minIdx = j;
            }
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
            for (int val : nums)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
