package DSA.Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        revNum(123);
    }

    private static void revNum(int n) {
        if(n<=0) return;
        else{
            System.out.print(n%10);
            revNum(n/10);
        }
    }
}
