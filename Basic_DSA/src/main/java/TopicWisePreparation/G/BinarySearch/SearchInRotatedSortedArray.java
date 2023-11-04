package TopicWisePreparation.G.BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        search(nums, target);
    }

    public static int search(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;   //7/2 = 3 = 1
            if (nums[mid] == target)
                return mid;
                //right side is sorted
            else if (nums[mid] < nums[h]) {
                if (target > nums[mid] && target <= nums[h]) {
                    l = mid + 1;
                } else h = mid - 1;
            }
            //left portion is sorted
            else {
                if (target >= nums[l] && target < nums[mid]) {
                    h = mid - 1;
                } else l = mid + 1;
            }
        }
        return -1;
    }
}
