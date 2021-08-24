package classwork.java8.employees_salaries;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Employee {
    private String name;
    private int salary;


    public static void main(String[] args) {
        Employee max = Employee.builder()
                .name("Max")
                .salary(100)
                .build();

        Employee alex = Employee.builder()
                .name("Alex")
                .salary(150)
                .build();

        List<Employee> list = List.of(max, alex);
        int sumSalary = list.stream()
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.println(sumSalary);
    }

}
