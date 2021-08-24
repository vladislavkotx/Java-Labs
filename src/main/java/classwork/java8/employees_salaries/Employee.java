package classwork.java8.employees_salaries;

import lombok.Builder;
import lombok.Data;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@Builder
public class Employee {
    private String name;
    private int salary;

    public static int employeeSum(List <Employee> list) {
        return list.stream()
                .mapToInt(Employee::getSalary)
                .sum();
    }

    public static List <String> sortedBySalary (List <Employee> list) {
        return list.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    public static Map <String, Employee> mapNameToEmployee (List <Employee> list) {
        return list.stream()
                .collect(Collectors.toMap(Employee::getName, t -> t, (t1, t2) -> (t1.getSalary() > t2.getSalary() ? t1 : t2)));
    }

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
        int sum = employeeSum(list);
        System.out.println(sum);

        List<String> strings = sortedBySalary(list);
        System.out.println(strings);

        Map<String, Employee> stringEmployeeMap = mapNameToEmployee(list);
        System.out.println(stringEmployeeMap);
    }

}
