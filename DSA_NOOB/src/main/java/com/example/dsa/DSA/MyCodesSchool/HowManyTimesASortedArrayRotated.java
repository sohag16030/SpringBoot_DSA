package com.example.dsa.DSA.MyCodesSchool;

// prerequisite :: Array must be sorted / No duplicate contains in the array
// ans is index of the min num of this array
/*
index=       0,           1,         2,  		 3, 	4,	5, 	6,	7
Int[] arr = 11,           12,        13, 	     14, 	2, 	3, 	4,	5

Mid = l-(u+l)/2;   // (l+u)/2

Prev = (mid-1+n)%n = 13
Next = (mid+1)%n = 2

if(arr[low]<= arr[high]) return low; // sorted array jonno return low. No rotation

else if(arr[mid]>=arr[next] && arr[mid]>=arr[prev])
   return mid;
else if( arr[mid]>=arr[prev] )
      l =  mid+1;
else h = mid -1 ;*/

public class HowManyTimesASortedArrayRotated {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 4, 5, 6};
        int pivotIndex = smallestValueIndexFind(0, 7, arr);
        System.out.println(pivotIndex);
    }

    private static int smallestValueIndexFind(int l, int h, int[] arr) {
        int n = arr.length;
        while (l <= h) {
            if (arr[l] <= arr[h]) return l;

            int mid = l + (h - l) / 2;
            int prev = (mid - 1 + n) % n;  //2
            int next = (mid + 1) % n; //4

            if (arr[prev] >= arr[mid] && arr[next] >= arr[mid])
                return mid;
            else if (arr[mid] <= arr[h])
                h = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }

}
