package TopicWisePreparation.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 0;
        Boolean ans = binarySearch(nums, 0, nums.length - 1, target);
    }

    private static Boolean binarySearch(int[] nums, int l, int h, int target) {
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target)
                return true;
            else if (target < nums[mid])
                return binarySearch(nums, l, mid - 1, target);
            else
                return binarySearch(nums, mid + 1, h, target);
        }
        return false;
    }
}
