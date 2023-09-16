package Java.Basics;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//sorting based on multiple field

@Data
@AllArgsConstructor
class Student1 {
    private Integer id;
    private String name;
    private Integer age;
}
class MyComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 stu1, Student1 stu2) {
        if (stu1.getId().equals(stu2.getId()))
            return Integer.compare(stu1.getAge(), stu2.getAge());
        else return Integer.compare(stu1.getId(), stu2.getId());
    }
}

public class Comparator_Interface {
    public static void main(String[] args) {
        List<Student1> stuList = Stream.of(
                new Student1(101, "John", 20),
                new Student1(101, "Robi", 22),
                new Student1(102, "Safi", 12),
                new Student1(102, "Safi", 18),
                new Student1(102, "Safi", 10)
        ).collect(Collectors.toList());

        Collections.sort(stuList, new MyComparator());

        System.out.println(stuList);

    }
}
