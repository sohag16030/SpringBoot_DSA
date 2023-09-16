package Java.Java_8;

import java.util.function.Predicate;

public class CustomPredicate {
    public static void main(String[] args) {
        Predicate<Integer> greaterCheck = n -> n > 100;
        Predicate<Integer> lessCheck = n -> n < 100;

        System.out.println(check(10,greaterCheck));
        System.out.println(check(10,lessCheck));
    }

    private static boolean check(int num, Predicate<Integer> condition) {
        return condition.test(num);
    }
}
