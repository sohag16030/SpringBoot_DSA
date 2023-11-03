package TopicWisePreparation.A.ArrayAndHashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArrayNotSorted {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 11, 15};
        int target = 9;
        Map<Integer, Boolean> seen = new HashMap<>();
        for (int v : numbers) {
            seen.put(v, true);
        }
        for (int v : numbers) {
            if (seen.containsKey(Math.abs(target - v))) {
                System.out.println(Math.abs(target - v));
                break;
            }
        }
    }
}
