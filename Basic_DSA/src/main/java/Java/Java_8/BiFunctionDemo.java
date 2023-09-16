package Java.Java_8;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addAction = (num1, num2) -> num1 + num2;
        //BiFunction<Integer, Integer, Integer> subsAction = (num1, num2) -> num1 - num2;
        int ans = BiFunctionDemo.takeAction(10, 15, addAction);
        System.out.println(ans);
    }

    public static int takeAction(int num1, int num2, BiFunction<Integer, Integer, Integer> action) {
        return action.apply(num1, num2);
    }
}
