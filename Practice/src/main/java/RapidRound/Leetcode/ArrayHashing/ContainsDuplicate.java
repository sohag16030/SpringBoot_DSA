package RapidRound.Leetcode.ArrayHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for (int val : nums) {
            mySet.add(val);
        }
        if (mySet.size() == nums.length) return false;
        else return true;
    }
}
