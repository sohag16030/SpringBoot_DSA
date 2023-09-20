package com.example.dsa.DSA.BinarySearchTree.LeetCode;

public class NextPermutation {
    public static void main(String[] args) {
        //nextPermutation(new int[]{9, 2, 1, 2, 7, 7, 3, 2});
        //nextPermutation(new int[]{4,1,7,5,3,2,0});
        nextPermutation(new int[]{3, 2, 1});
        //nextPermutation(new int[]{3, 2, 8, 9, 7, 5});
    }

    public static void nextPermutation(int[] nums) {
        int k = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                k = i - 1;
                break;
            }
        }
        if (k == -1) {
            int end = nums.length - 1;
            int start = 0;
            int step = 0;
            while (step < nums.length / 2) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
                step++;
            }
        }
        else{
            for (int pos = nums.length - 1; pos > 0; pos--) {
                if (nums[pos] > nums[k]) {
                    int temp = nums[pos];
                    nums[pos] = nums[k];
                    nums[k] = temp;
                    break;
                }
            }
            int step = 0;
            int reverseLength = nums.length - (k + 1);
            int pos = k + 1;
            int x = nums.length - 1;

            while (step < reverseLength / 2) {
                int temp = nums[pos];
                nums[pos] = nums[x];
                nums[x] = temp;
                pos++;
                x--;
                step++;
            }
            System.out.println(k);
        }

    }

}
