package Java.Java_8;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer, String> myFunction = (i) -> "Function called " + i;
        System.out.println(myFunction.apply(10));
    }

}
