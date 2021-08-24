package classwork.java8.employees;

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



    public static void main(String[] args) {
        Employee max = Employee.builder()
                .name("Max")
                .salary(10)
                .build();

        Employee alex = Employee.builder()
                .name("Alex")
                .salary(100)
                .build();

        List<Employee> list = List.of(max, alex);
        Map<Seniority, Long> seniorityLongMap = EmployeeUtils.groupBySeniority(list);
        System.out.println(seniorityLongMap);

//        int sum = EmployeeUtils.employeeSum(list);
//        System.out.println(sum);
//
//        List<String> strings = EmployeeUtils.getNamesSortedBySalary(list);
//        System.out.println(strings);
//
//        Map<String, Employee> stringEmployeeMap = EmployeeUtils.mapNameToEmployee(list);
//        System.out.println(stringEmployeeMap);
    }

}
