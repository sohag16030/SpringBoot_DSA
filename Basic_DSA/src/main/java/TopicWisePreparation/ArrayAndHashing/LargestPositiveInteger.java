package TopicWisePreparation.ArrayAndHashing;

import java.util.HashMap;
import java.util.Map;

public class LargestPositiveInteger {
    public static void main(String[] args) {
        int[] nums = {-1,10,6,7};
        System.out.println(findMaxK(nums));
    }

    public static int findMaxK(int[] nums) {
        Map<Integer, Boolean> check = new HashMap();
        for (int num : nums) {
            check.put(num, true);
        }
        int max = 0;
        for (int num : nums) {
            if (num > max) {
                if (check.containsKey(-1 * num))
                    max = num;
            }
        }
        return max != 0 ? max : -1;
    }
}

