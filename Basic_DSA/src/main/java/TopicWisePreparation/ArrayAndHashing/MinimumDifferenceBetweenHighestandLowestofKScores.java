package TopicWisePreparation.ArrayAndHashing;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestandLowestofKScores {
    public static void main(String[] args) {
        int[] nums = {9, 4, 1, 7};
        int k = 3;
        int ans = minimumDifference(nums, k);
    }

    public static int minimumDifference(int[] nums, int k) {
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= sortedNums.length - k; i++) {
            int firstElement = sortedNums[i];
            int secondElement = sortedNums[i + k - 1];
            min = Math.min(secondElement - firstElement, min);
            System.out.println(min);
        }
        return min;
    }
}
