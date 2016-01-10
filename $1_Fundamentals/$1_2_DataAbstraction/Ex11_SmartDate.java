package $1_Fundamentals.$1_2_DataAbstraction;

import edu.princeton.cs.algs4.Date;

import java.util.Calendar;

/**
 * Created by hailstone01 on 1/10/16.
 */
public class Ex11_SmartDate extends Date {
    public Ex11_SmartDate(int month, int day, int year) throws Exception {
        super(month, day, year);
        if (!isLegal(month, day, year)) {
            throw new Exception("date not legal");
        }
    }

    public Ex11_SmartDate(String date) throws Exception {
        super(date);
        String[] fields = date.split("/");
        if (fields.length != 3) {
            throw new Exception("Invalid date");
        }
        if (!isLegal(Integer.valueOf(fields[0]), Integer.valueOf(fields[0]), Integer.valueOf(fields[0]))) {
            throw new Exception("date not legal");
        }

    }

    public String dayOfTheWeek() {
        Calendar cal = Calendar.getInstance();
        cal.set(this.year(), this.month() - 1, this.day());
        int week_index = cal.get(Calendar.DAY_OF_WEEK);
        String[] weekMap = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return weekMap[week_index - 1];
    }

    public static boolean isLegal(int month, int day, int year) {
        if (month < 1 || month > 12) {
            return false;
        }

        if (day < 1 || day > 31) {
            return false;
        }

        if (year < 0) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Ex11_SmartDate ex = null;
        try {
            ex = new Ex11_SmartDate(1, 10, 2016);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(ex.dayOfTheWeek());
    }
}
