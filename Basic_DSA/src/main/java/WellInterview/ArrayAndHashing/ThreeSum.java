package WellInterview.ArrayAndHashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 3, -2, 0, -3, 1, 2, 1};
        int target = 9;
        Arrays.sort(nums);
        ThreeSumReturn(nums);
    }

    private static void ThreeSumReturn(int[] nums) {
        //-3, -2, -1, 0, 1, 1, 2, 3
        // -3
        // -2, -1, 0, 1, 1, 2, 3
        //        l=3         h=7

        //  1 , 3
        Set<String> result = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int l = i + 1, h = nums.length - 1;
            while (l < h) {
                if (nums[i] + nums[l] + nums[h] == 0) {
                    result.add(nums[i] + "" + nums[l] + "" + nums[h]);
                    l = l + 1;
                    h = h - 1;

                } else if (nums[l] + nums[h] > -1 * nums[i])
                    h = h - 1;
                else
                    l = l + 1;
            }

        }
    }
}
