package TopicWisePreparation.A.ArrayAndHashing;

import java.util.*;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        intersection(nums1,nums2);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersectionCheck = new HashSet<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            intersectionCheck.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (intersectionCheck.contains(nums2[j])) {
                set.add(nums2[j]);
            }
        }
        int[] intersectElements = new int[set.size()];

        Iterator<Integer> itr = set.iterator();
        int k =0;
        while (itr.hasNext()) {
            intersectElements[k++] = itr.next();
        }
        return intersectElements;
    }
}
