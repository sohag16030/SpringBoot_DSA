package RecapRound.Recursion;

public class Factorial_Recursion_Practice {
    public static void main(String[] args) {
        int ans = fac(4);
        System.out.println(ans);
    }

    private static int fac(int n) {
        if (n == 1) return 1;
        else return n * fac(n - 1);

    }
}
