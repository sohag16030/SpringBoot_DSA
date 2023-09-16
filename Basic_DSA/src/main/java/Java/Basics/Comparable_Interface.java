package Java.Basics;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//sorting based on one field

@Data
@AllArgsConstructor
class Student implements Comparable<Student>{
    private Integer id;
    private String name;
    private Integer age;

    @Override
    public int compareTo(Student other) {
        return id.compareTo(other.id);
    }
}

public class Comparable_Interface {
    public static void main(String[] args) {
        List<Student> stuList = Stream.of(
                new Student(104,"John",20),
                new Student(101,"Robi",22),
                new Student(102,"Safi",12)
        ).collect(Collectors.toList());

        Collections.sort(stuList);
        System.out.println(stuList);

    }
}
