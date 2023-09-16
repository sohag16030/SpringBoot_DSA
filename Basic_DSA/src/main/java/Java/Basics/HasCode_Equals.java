package Java.Basics;


import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HasCode_Equals {
    public static void main(String[] args) {
        Set<Employee> employeeSet = Stream.of(
                new Employee("111", "Rafi"),
                new Employee("111", "Rafi")
        ).collect(Collectors.toSet());
    }
}

class Employee {
    public String id;
    public String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}