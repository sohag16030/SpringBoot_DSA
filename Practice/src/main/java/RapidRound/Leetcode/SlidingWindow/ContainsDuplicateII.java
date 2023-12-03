package RapidRound.Leetcode.SlidingWindow;

import RapidRound.Leetcode.ArrayHashing.MinimumNumberOfMovesToSeatEveryone;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean res = containsNearbyDuplicate(nums, k);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        //  1, 2, 3, 1,1
        // [1]->3,4
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                int prevIndex = map.get(nums[i]);
                int currIndex = i;
                if (currIndex - prevIndex <= k)
                    return true;
                else map.put(nums[i], currIndex);
            }
        }
        return false;
    }
}
