package classwork.java8.employees;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeUtils {
    public static int employeeSum(List<Employee> list) {
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

    public static Map<String, Employee> mapNameToEmployee (List <Employee> list) {
        return list.stream()
                .collect(Collectors.toMap(Employee::getName, t -> t, (t1, t2) -> (t1.getSalary() > t2.getSalary() ? t1 : t2)));
    }
}
