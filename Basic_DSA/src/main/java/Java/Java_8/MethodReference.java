package Java.Java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//A method reference would have a syntax like ClassName::methodName, where ClassName is the class containing
//        the method you want to reference, and methodName is the name of the method you want to use as a reference.
//        In your example, you're using a lambda expression to define the function directly rather than referencing an existing method.

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Example: Using an arbitrary object method reference
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(System.out::println);

        // Example: Using a constructor method reference
        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> newList = listSupplier.get();
    }

}

