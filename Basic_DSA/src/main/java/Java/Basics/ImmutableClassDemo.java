package Java.Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class EmployeeTest {
    private final String name;
    private final List<String> numbers;

    EmployeeTest(String name, List<String> numbers) {
        this.name = name;
        this.numbers = numbers;
    }
    public String getName() {
        return name;
    }
    public List<String> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }
}

public class ImmutableClassDemo {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("10001");
        EmployeeTest employeeTest = new EmployeeTest("Mike", numbers);
        System.out.println(employeeTest.getName() + " " + employeeTest.getNumbers());
        employeeTest.getNumbers().add("322100");
        System.out.println(employeeTest.getName() + " " + employeeTest.getNumbers());
    }
}
