package homework.lab5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BlackFridayService {
    public void printBlackFridayPerYearSorted(int startYear, int endYear) {
        LocalDate startDate = LocalDate.of(startYear, 1, 1);

        Stream.iterate(startDate, date -> date.getYear() != endYear, date -> date.plusDays(1))
                .filter(date -> date.getDayOfWeek() == DayOfWeek.FRIDAY)
                .filter(date -> date.getDayOfMonth() == 13)
                .collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparingInt(Map.Entry::getKey))
                .sorted((y1, y2) -> (int) (y2.getValue() - y1.getValue()))
                .forEach(System.out::println);
//        System.out.println(collect);
    }

    public static void main(String[] args) {
        BlackFridayService blackFridayService = new BlackFridayService();
        blackFridayService.printBlackFridayPerYearSorted(2000, 2022);
    }
}
