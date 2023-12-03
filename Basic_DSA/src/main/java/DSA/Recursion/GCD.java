package DSA.Recursion;

public class GCD {
    public static void main(String[] args) {
        int ans = findGCD(3, 12);
        System.out.println(ans);
    }

    private static int findGCD(int a, int b) {
        if (a == 0) return b;
        else return findGCD(b % a, a);
    }
}
