package com.example.dsa.AdvanceJava;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // Predicate example
        Predicate<Integer> isEvenPredicate = num -> num % 2 == 0;
        boolean isEven = isEvenPredicate.test(6);
        System.out.println(isEven); // Output: true

        Predicate<Integer> returnEvenNumber = num -> num % 2 == 0;
        System.out.println(returnEvenNumber.test(4));

        BiFunction<Integer, Integer, Integer> add = (num1, num2) -> num1 + num2;
        BiFunction<Integer, Integer, Integer> substract = (num1, num2) -> num1 - num2;

        int ans = performAction(20, 10, add);
    }

    private static int performAction(int num1, int num2, BiFunction<Integer, Integer, Integer> action) {
        return action.apply(num1, num2);
    }

}
