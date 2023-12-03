package RapidRound.Leetcode.TwoPointers;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        twoSum(numbers, target);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int l = 0, h = numbers.length - 1;
        while (l < h) {
            if (numbers[l] + numbers[h] == target) return new int[]{l+1, h+1};
            else if (numbers[l] + numbers[h] > target)
                h--;
            else
                l++;
        }
        return new int[]{};
    }
}
