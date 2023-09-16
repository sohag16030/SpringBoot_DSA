package DSA.PopularAlgoDS;

public class KadanasAlgoForMMS {
    public static void main(String[] args) {
        int[] arr = {4, 2, -5, 7, 8, -100, -9};
        int maxMMS = kadanasAlog(arr, 7);
        System.out.println(maxMMS);
    }

    private static int kadanasAlog(int[] arr, int l) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < l; i++) {
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) currSum = 0;
        }
        return maxSum;
    }
}
