// Description: Write a program to get the day of the week for a given date.
// The program will take three integers as input: day, month, and year, and will return the day of the week for that date.
import java.util.Calendar;

public class calender {
    public static String getDay(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return days[dayOfWeek - 1];
    }
}
