package Java.Java_8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
//        String value = "Hello";
//       // Optional<String> optionalValue = Optional.ofNullable(value).orElse();
//        Optional<String> optionalValue = Optional.ofNullable(value);
//
//        if (optionalValue.isPresent()) {
//            System.out.println("not null");
//        } else if (optionalValue.isEmpty()) {
//            System.out.println("null");
//        }
        String value = null;
        Optional<String> optionalValue = Optional.of(Optional.ofNullable(value).orElse("test"));
        System.out.println(optionalValue.isPresent());
    }
}
