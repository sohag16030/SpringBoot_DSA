package TopicWisePreparation.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberofArithmeticTriplets {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 8, 9};
        int diff = 2;
        arithmeticTriplets(nums, diff);
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        Map<Integer, Boolean> check = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            check.put(nums[i], true);
        }
        for (int i = 0; i < nums.length; i++) {
            if (check.containsKey(nums[i] - diff) && check.containsKey(nums[i] + diff)) {
                System.out.println(nums[i] - diff);
                System.out.println(nums[i]);
                System.out.println(nums[i] + diff);
                count++;
            }
        }
        return count;
    }
}
