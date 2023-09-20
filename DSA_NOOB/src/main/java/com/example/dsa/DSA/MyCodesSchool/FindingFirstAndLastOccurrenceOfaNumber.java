package com.example.dsa.DSA.MyCodesSchool;

public class FindingFirstAndLastOccurrenceOfaNumber {
    public static void main(String[] args) {
        // 2,4,10,18,20
        //0 ,1, 2, 3, 4, 5, 6

        int[] arr = {2, 4, 10, 10, 10, 20, 20}; // must be sorted data set
        int firstIndex = FindFirstOccurrence(0, 7, arr, 10);
        System.out.println(firstIndex);
        int lastIndex = FindLastOccurrence(0, 7, arr, 10);
        System.out.println(lastIndex);

    }

    private static int FindFirstOccurrence(int l, int h, int[] arr, int n) {
        int firstIndex = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == n) {
                firstIndex = mid;
                h = mid - 1;
            } else if (n < arr[mid])
                h = mid - 1;
            else l = mid + 1;
        }
        return firstIndex;
    }

    private static int FindLastOccurrence(int l, int h, int[] arr, int n) {
        int lastIndex = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == n) {
                lastIndex = mid;
                l = mid + 1;
            } else if (n < arr[mid])
                h = mid - 1;
            else l = mid + 1;
        }
        return lastIndex;
    }
}
