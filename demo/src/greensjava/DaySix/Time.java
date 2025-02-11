package greensjava.DaySix;

import java.time.LocalDate;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDate date = LocalDate.now();
        System.out.println(date);
    }
}
