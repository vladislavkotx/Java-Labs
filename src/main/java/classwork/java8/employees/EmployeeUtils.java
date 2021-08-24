package classwork.java8.employees;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeUtils {
    public static Map<Seniority, Long> groupBySeniority (List <Employee> employees) {
//        Map<Seniority, Long> collect = employees.stream().collect(Collectors.groupingBy(e -> Seniority.findBySalary(e.getSalary()), Collectors.counting()));
//        Map<Seniority, Long> collect = employees.stream().collect(Collectors.groupingBy(e -> Seniority.getPositionBySalary(e.getSalary()), Collectors.counting()));
        Map<Seniority, Long> collect = employees.stream().collect(Collectors.groupingBy(e -> Seniority.findBySalaryWithFilter(e.getSalary()), Collectors.counting()));
        return collect;
    }



    public static int employeeSum(List<Employee> list) {
        return list.stream()
                .mapToInt(Employee::getSalary)
                .sum();
    }

    public static List <String> getNamesSortedBySalary (List <Employee> list) {
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
