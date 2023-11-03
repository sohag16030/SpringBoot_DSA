package TopicWisePreparation.G.BinarySearch;

import java.util.ArrayList;
import java.util.LinkedList;

public class BinarySearchInTwoDSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7, 8},
                         {10, 11, 16, 20, 21},
                         {23, 30, 34, 60, 61}};
        int target = 3;
        int n = 5;
        int m = 4;
        int l = 0, h = (n * m) - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (matrix[mid / m][mid % m] == target)
                System.out.println(mid);
            else if (target < matrix[mid / m][mid % m])
                h = h - 1;
            else l = l + 1;
        }
    }
}
