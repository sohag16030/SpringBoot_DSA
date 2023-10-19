package TopicWisePreparation.BackTracking;

import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {0};
        List<List<Integer>> resultSetList = new ArrayList<>();
        Set<ArrayList<Integer>> seen = new HashSet<>();
        subsetBacktrack(nums, new ArrayList<Integer>(), resultSetList, 0, seen);
        System.out.println(resultSetList);
    }

    private static void subsetBacktrack(int[] input, ArrayList<Integer> curr, List<List<Integer>> resultSetList, int start, Set<ArrayList<Integer>> seen) {
        if (unique(curr, seen))
            resultSetList.add(new ArrayList<>(curr));
        for (int i = start; i < input.length; i++) {
            curr.add(input[i]);
            System.out.println(curr);
            subsetBacktrack(input, curr, resultSetList, i + 1, seen);
            curr.remove(curr.size() - 1);
        }
    }

    private static boolean unique(ArrayList<Integer> curr, Set<ArrayList<Integer>> seen) {
        Collections.sort(curr);
        if (!seen.contains(curr)) return true;
        return false;
    }
}
