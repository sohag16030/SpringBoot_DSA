package RapidRound.Leetcode.ArrayHashing;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 2, 3, 1, 4, 5};
        System.out.println(numIdenticalPairs(nums));
    }

    private static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        map.put(1, 0);
        for (int i = 2; i <= 100; i++) {
            int prev = map.get(i - 1);
            map.put(i, prev + i - 1);
        }
        Map<Integer, Integer> checkFreq = new HashMap<>();
        for (int n : nums) {
            if (!checkFreq.containsKey(n)) {
                checkFreq.put(n, 1);
            } else {
                int prevVal = checkFreq.get(n);
                checkFreq.put(n, prevVal + 1);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : checkFreq.entrySet()) {
            count += map.get(entry.getValue());
        }
        return count;
    }
}
