package com.example.dsa.AdvanceJava;

import java.util.function.BiFunction;

public class OperationPerformUsingBiFunction {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        BiFunction<Integer, Integer, Integer> action = (num1, num2) -> num1 + num2;
//        BiFunction<Integer, Integer, Integer> action = (num1, num2) -> num1 - num2;
//        BiFunction<Integer, Integer, Integer> action = (num1, num2) -> num1 * num2;
//        BiFunction<Integer, Integer, Integer> action = (num1, num2) -> num1 / num2;

        int add = performAction(a, b, action);
//        int sub = performAction(a, b, action);
//        int mul = performAction(a, b, action);
//        int div = performAction(a, b, action);

        System.out.println(add);
//        System.out.println(sub);
//        System.out.println(mul);
//        System.out.println(div);
    }

    private static int performAction(int a, int b, BiFunction<Integer, Integer, Integer> action) {
        return action.apply(a, b);
    }
}
