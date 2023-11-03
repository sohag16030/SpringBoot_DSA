package TopicWisePreparation.G.BinarySearch;

public class SearchInRotatedArrayList {
    public static void main(String[] args) {
        int[] nums = {40, 45, 50, 60, 10, 15, 20, 30, 35};
        int l = 0, h = nums.length - 1, target = 10;

        while (l <= h) {
            int mid = l + (h - l) / 2; // 4
            if (nums[mid] == target) System.out.println("Yes");

            //  build logic for right side first..then reverse for left side..
            //  check right side data sorted or not

            if (nums[h] >= nums[mid]) {
                if (target > nums[mid] && target <= nums[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            } else {
                if (target >= nums[l] && target < nums[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
    }
}
