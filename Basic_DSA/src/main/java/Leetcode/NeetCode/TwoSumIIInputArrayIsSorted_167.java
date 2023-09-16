package Leetcode.NeetCode;

public class TwoSumIIInputArrayIsSorted_167 {
    public static void main(String[] args) {
        int[] numbers = {1,2, 3, 4,5,10,11};
        int target = 9;
        int[] ans = twoSum(numbers, target);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }

    private static int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            if(numbers[low]+numbers[high]==target)
                return new int[]{low+1,high+1};
            else if(numbers[low]+numbers[high]<target)
                low+=1;
            else
                high-=1;
        }
        return new int[0];
    }
}
