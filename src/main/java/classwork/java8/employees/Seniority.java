package classwork.java8.employees;

import classwork.enums.HttpCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Getter
@RequiredArgsConstructor
public enum Seniority {
    JUNIOR(0, 10), MIDDLE(11, 20), SENIOR(21, 1000);

    private final int minSalary;
    private final int maxSalary;

    private static final Map<Integer, Seniority> BY_SALARY = new HashMap<>();

    static {
        for (Seniority e : values()) {
            for (int i = e.minSalary; i <= e.maxSalary; i++)
                BY_SALARY.put(i, e);
        }
    }
    public static Seniority getPositionBySalary (int newSalary) {
        return BY_SALARY.get(newSalary);
    }

    public static Seniority findBySalaryWithFilter (int newSalary) {
        Seniority[] positions = values();
        Optional<Seniority> first = Arrays.stream(positions).filter(s -> s.minSalary <= newSalary && s.maxSalary >= newSalary).findFirst();
        return first.get();
    }

/*    public static Seniority findBySalary (int newSalary) {
        Seniority[] positions = values();
        for(Seniority position : positions){
            if (newSalary >= position.minSalary && newSalary <= position.maxSalary){
                return position;
            }
        }
        throw new IllegalArgumentException("Code " + newSalary + " was not found");
    }*/
}
