package WellInterview.ArrayAndHashing;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] nums = {101, 112, 11, 12, 1, 5, 2, 3, 4, 103};
        Arrays.sort(nums);
        // need to sorting this array // min complexity O(nlogn)// most sufficient sorting algo// like merge/heap/quick/ or built in sorting
        //1,2,11,12,13,14,101,102,103,104,105,106,107,108,109
        // min = 1 and max = 103

        int count = 1;
        int max = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i + 1] - nums[i] == 1)
                count++;
            else  {
                max = Math.max(max,count);
                count = 1;
            }
        }
        max = Math.max(max,count);

    }
}
