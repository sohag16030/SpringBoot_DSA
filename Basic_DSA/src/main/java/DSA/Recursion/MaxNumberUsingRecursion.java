package DSA.Recursion;

public class MaxNumberUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {15, 11, 12, 9};
        int ans = maxNumberFind(4, arr);
        System.out.println(ans);
    }

    static int max = 0;
    private static int maxNumberFind(int n, int[] arr) {
        if (n == 0) return max;
        else {
            max = Math.max(max, arr[n - 1]);
            return maxNumberFind(n - 1, arr);
        }
    }
}
