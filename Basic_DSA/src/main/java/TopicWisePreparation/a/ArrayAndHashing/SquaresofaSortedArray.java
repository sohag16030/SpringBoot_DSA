package TopicWisePreparation.a.ArrayAndHashing;

import java.util.*;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        sortedSquares(nums);
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        int[] ans = Arrays.stream(nums).sorted().toArray();
        return ans;
    }
}
