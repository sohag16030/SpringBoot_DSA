package Leetcode.NeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class Three_Sum_15 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        List<List<Integer>> res = threeSum(nums);
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> num = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<String> seen = new HashSet<>();
        int max = 0;
        for (int i = 0; i < num.size(); i++) {
            List<Integer> processList = new ArrayList<>();
            int temp = 0;
            for (int j = 0; j < num.size(); j++) {
                if (j != i)
                    processList.add(num.get(j));
                else
                    temp = num.get(i);
            }
            int low = 0, high = processList.size() - 1;

            while (low < high) {
                if (processList.get(low) + processList.get(high) == -temp) {
                    int[] arr = new int[]{num.get(i), processList.get(low), processList.get(high)};
                    Arrays.sort(arr);
                    String unique = arr[0] + " " + arr[1] + " " + arr[2];
                    seen.add(unique);
                    int l = seen.size();
                    if (l > max) {
                        List<Integer> res = Arrays.stream(arr).boxed().collect(Collectors.toList());
                        ans.add(res);
                        System.out.println(unique);
                        max = l;
                    }
                    high -= 1;
                    low += 1;
                    // break;
                } else if (processList.get(low) + processList.get(high) > -temp)
                    high -= 1;
                else if (processList.get(low) + processList.get(high) < -temp)
                    low += 1;
            }
        }
        return ans;
    }
}
