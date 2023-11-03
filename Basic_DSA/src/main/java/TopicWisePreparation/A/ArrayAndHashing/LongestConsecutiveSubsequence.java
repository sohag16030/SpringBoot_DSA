package TopicWisePreparation.A.ArrayAndHashing;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
//        int[] nums = {101, 112, 11, 12, 1, 5, 2, 3, 4, 103};
//        Arrays.sort(nums);
        // need to sorting this array // min complexity O(nlogn)// most sufficient sorting algo// like merge/heap/quick/ or built in sorting
        //1,2,11,12,13,14,101,102,103,104,105,106,107,108,109
        // min = 1 and max = 103

//        int count = 1;
//        int max = 1;
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i + 1] - nums[i] == 1)
//                count++;
//            else  {
//                max = Math.max(max,count);
//                count = 1;
//            }
//        }
//        max = Math.max(max,count);

        // it could be solved on O(n)

        int[] nums = {101, 102, 100, 112, 11, 12, 1, 5, 2, 3, 4,};
        // insert all these elements in a map first
        // iterate the map key to backward and forward direct and check the map key is visited sequencial order
        Map<Integer, Boolean> map = new HashMap<>();
        for (int val : nums)
            map.put(val, true);
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            int root = nums[i];
            if (map.get(root)) {
                map.put(root, false);
                // forward direction and visited if possible
                int forward = root + 1;
                while (map.containsKey(forward) && map.get(forward)) {
                    map.put(forward, false);
                    forward++;
                    count++;
                }
                // backward direction and visit if possible
                int backward = root - 1;
                while (map.containsKey(backward) && map.get(backward)) {
                    map.put(backward, false);
                    backward--;
                    count++;
                }
                max = Math.max(max, count);

            }

        }
        System.out.println(max);
    }
}
