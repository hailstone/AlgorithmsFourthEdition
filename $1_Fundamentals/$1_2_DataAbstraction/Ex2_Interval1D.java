package $1_Fundamentals.$1_2_DataAbstraction;

import edu.princeton.cs.algs4.Interval1D;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/10/16.
 */
public class Ex2_Interval1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Interval1D[] intervals = new Interval1D[N];
        for (int i = 0; i < N; i++) {
            intervals[i] = new Interval1D(scanner.nextDouble(), scanner.nextDouble());
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (intervals[i].intersects(intervals[j])) {
                    System.out.println(intervals[i] + " and " + intervals[j] + " intersects");
                }
            }
        }
    }
}
