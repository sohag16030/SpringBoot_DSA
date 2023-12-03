package TopicWisePreparation.A.ArrayAndHashing;

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(25));
    }

    public static int trailingZeroes(int n) {
        int count = 0;
        if (n >= 5) {
            for (int i = 1; i * 5 <= n; i++) {
                int num = i * 5;
                while (num % 5 == 0) {
                    count++;
                    num = num / 5;
                }
            }
        }

        return count;
    }
}
