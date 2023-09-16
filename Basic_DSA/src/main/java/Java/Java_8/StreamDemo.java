package Java.Java_8;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
class Student {
    private int id;
    private String name;
    private List<String> numbers;
}

public class StreamDemo {
    public static void main(String[] args) {
        List<Student> stuList = Stream.of(
                new Student(101, "John", Arrays.asList("0927272", "389278729")),
                new Student(107, "Robi", Arrays.asList("0927272", "389278729")),
                new Student(102, "Bopara", Arrays.asList("0927272", "389278729"))
        ).collect(Collectors.toList());

        List<String> names = stuList.stream().map(user -> user.getName()).collect(Collectors.toList());
        List<List<String>> numbers = stuList.stream().map(user -> user.getNumbers()).collect(Collectors.toList());

        //all numbers
        List<String> numberList = stuList.stream().flatMap(user -> user.getNumbers().parallelStream()).collect(Collectors.toList());

        // Arrays frequency count from a arr
        List<Integer> list = Arrays.asList(10, 10, 20, 10, 20, 11, 1, 1, 2);

        Map<Integer, Long> countMap = list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        String str = new String("khkhfqqo");

        Map<Character, Long> countingFrequency = str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    }
}