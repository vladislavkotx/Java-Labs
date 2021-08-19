package classwork.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM%dd");

    public static LocalDate convertStringToDate(String strDate) {
        return LocalDate.parse(strDate, formatter);
    }

    public static String convertDateToString(LocalDate date) {
        return formatter.format(date);
    }

    public static void main(String[] args) {
        String str = "2020_10%30";
        LocalDate localDate = DateUtils.convertStringToDate(str);
        System.out.println(localDate);
        String myDateStr = convertDateToString(localDate);
        System.out.println(myDateStr);
    }
}