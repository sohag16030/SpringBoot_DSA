package DSA.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {22, 15, 11, 8, 7};
        //15,22,11,8,7
        //15,11,22,8,7
        //15,11,8,22,7
        //step 1: 15,11,8,7,22
        int l = nums.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
//            for (int v : nums)
//                System.out.print(v + " ");
//            System.out.println();
        }
        for (int v : nums)
            System.out.println(v);
    }
}
