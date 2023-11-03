package TopicWisePreparation.c.TwoPointers;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties;

import java.util.*;

public class ThreeSum_Practice {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        List<List<Integer>> ans = threeSum(nums);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        List<List<Integer>> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < sortedNums.length; i++) {
            int l = i + 1, h = sortedNums.length - 1;
            while (l < h) {
                int sum = sortedNums[i] + sortedNums[l] + sortedNums[h];
                if (sum == 0) {
                    Boolean unique = uniqueReturn(set, sortedNums[i], sortedNums[l], sortedNums[h]);
                    if (unique) {
                        List<Integer> list = new ArrayList<>();
                        list.add(sortedNums[i]);
                        list.add(sortedNums[l]);
                        list.add(sortedNums[h]);
                        ans.add(list);
                    }
                    l++;
                    h--;

                } else if (sum > 0)
                    h--;
                else
                    l++;
            }
        }
        return ans;
    }

    private static Boolean uniqueReturn(Set<String> set, int i, int l, int h) {
        if (set.contains(i + "" + l + "" + h))
            return false;
        else {
            set.add(i + "" + l + "" + h);
            return true;
        }
    }
}
