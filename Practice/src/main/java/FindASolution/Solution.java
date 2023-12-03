package FindASolution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        1 2 5 10 20 50 100
//
//        n = 80
//                = 50 20 10
        Scanner sc = new Scanner(System.in);
        //int data = sc.nextInt();
        int data = 222;
        int[] arr = {1, 2, 5, 10, 20, 50, 100};
        Map<Integer, Integer> notetypesCount = new HashMap<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (data > 0 && data >= arr[i]) {
                if (!notetypesCount.containsKey(arr[i])) {
                    notetypesCount.put(arr[i], data / arr[i]);
                } else {
                    notetypesCount.put(arr[i], notetypesCount.get(arr[i]) + data / arr[i]);
                }
                data = data % arr[i];
            }
        }
    }
}
