package RapidRound.Recursion;

public class Fibonacci_Practice {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            int ans = fib(i);
            System.out.println(ans);
        }
    }

    private static int fib(int n) {
        if (n <= 1) return 1;
        else return fib(n - 1) + fib(n - 2);
    }
}
