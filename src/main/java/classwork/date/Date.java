package classwork.date;

import lombok.Data;

public class Date {
    public int year;
    public int month;
    public int day;

    public Date (Integer[] ints) {
        year = ints[0];
        month = ints[1];
        day = ints[2];
    }

    @Override
    public String toString() {
        return "" + year + "_" + month + "_" + day;
    }
}
