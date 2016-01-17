package $1_fundamentals.$1_3_bags_queues_and_stacks;

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.Queue;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/13/16.
 */
public class Ex16 {
    public static Date[] readDates() {
        Scanner scanner = new Scanner(System.in);

        Queue<Date> q = new Queue<Date>();
        while (scanner.hasNext()) {
            String s = scanner.next();
            String[] items = s.split("/");
            Date date = new Date(Integer.valueOf(items[0]), Integer.valueOf(items[1]), Integer.valueOf(items[2]));
            q.enqueue(date);
        }

        Date[] dates = new Date[q.size()];
        for (int i = 0; i < dates.length; i++) {
            dates[i] = q.dequeue();
        }

        return dates;
    }



    public static void main(String[] args) {
        Date[] dates = readDates();

        for (Date date : dates) {
            System.out.println(date);
        }
    }
}
