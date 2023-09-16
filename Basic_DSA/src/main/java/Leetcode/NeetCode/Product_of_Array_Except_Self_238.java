package Leetcode.NeetCode;

import java.util.Arrays;
import java.util.Collections;

public class Product_of_Array_Except_Self_238 {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] num = productExceptSelf(nums);
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];

        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] * prefix[i - 1];
        }
        int[] reversedArray = Arrays.stream(nums)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        int[] tempPostfix = new int[nums.length];
        tempPostfix[0] = reversedArray[0];
        for (int i = 1; i < reversedArray.length; i++) {
            tempPostfix[i] = reversedArray[i] * tempPostfix[i - 1];
        }
        postfix = Arrays.stream(tempPostfix)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i = 0; i < nums.length; i++) {
           if(i==0){
               nums[i]=postfix[i+1];
           }
           else if(i==nums.length-1){
               nums[i]=prefix[nums.length-2];
           }
           else{
               nums[i]=prefix[i-1]*postfix[i+1];
           }
        }
        return new int[10];
    }

}
