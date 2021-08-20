package classwork.date;

import java.util.Date;

public class DateUtils2 {

    public static java.util.Date convertStringToDate(String str) {
        return new java.util.Date(str);
    }
    public static String convertDateToString(java.util.Date date) {
        return date.toString();
    }


    public static void main(String[] args) {
        java.util.Date myDate = new java.util.Date(2020, 10, 10);
        String stringDate = DateUtils2.convertDateToString(myDate);
        System.out.println(stringDate);
        java.util.Date dateDate = DateUtils2.convertStringToDate(stringDate);
        System.out.println(dateDate);
    }
}
