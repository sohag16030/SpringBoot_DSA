package TopicWisePreparation.G.BinarySearch;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = searchRange(nums, target);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int firstIndex = findFirstIndexHelper(nums, 0, nums.length - 1, target);
        int lastIndex = findLastIndexHelper(nums, 0, nums.length - 1, target);
        return new int[]{firstIndex, lastIndex};
    }

    public static int findFirstIndexHelper(int[] nums, int l, int h, int target) {
        int min_idx = Integer.MAX_VALUE;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                h = mid - 1;
                min_idx = Math.min(min_idx, mid);
            } else if (target < nums[mid])
                h = mid - 1;
            else l = mid + 1;
        }
        return min_idx == Integer.MAX_VALUE ? -1 : min_idx;
    }

    public static int findLastIndexHelper(int[] nums, int l, int h, int target) {
        int max_idx = Integer.MIN_VALUE;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                l = mid + 1;
                max_idx = Math.max(max_idx, mid);
            } else if (target < nums[mid])
                h = mid - 1;
            else l = mid + 1;
        }
        return max_idx == Integer.MIN_VALUE ? -1 : max_idx;
    }
}
