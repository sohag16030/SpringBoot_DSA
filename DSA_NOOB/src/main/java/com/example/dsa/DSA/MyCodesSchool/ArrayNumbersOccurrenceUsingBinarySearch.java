package com.example.dsa.DSA.MyCodesSchool;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayNumbersOccurrenceUsingBinarySearch {
    public static void main(String[] args) {
        int[] myarr = {2, 4, 10, 10, 10, 18, 20};
        int firstOccurrence = FindFirstOccurrence(0, 7, myarr, 10);
        int LastOccurrence = FindLastOccurrence(0, 7, myarr, 10);
        System.out.println("Number Of Occurrence : ");
        System.out.println(LastOccurrence - firstOccurrence + 1);

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
