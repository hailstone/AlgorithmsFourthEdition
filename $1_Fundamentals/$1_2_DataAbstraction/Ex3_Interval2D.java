package $1_Fundamentals.$1_2_DataAbstraction;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdDraw;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/10/16.
 */
public class Ex3_Interval2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double min = scanner.nextDouble();
        double max = scanner.nextDouble();

        Interval2D[] interval2Ds = new Interval2D[N];

        StdDraw.setScale(min, max);
        StdDraw.setPenRadius(0.01);
        for (int i = 0; i < N; i++) {
            double left = Math.random() * (max - min) + min;
            double right = Math.random() * (max - min) + min;
            Interval1D x = new Interval1D(Math.min(left, right), Math.max(left, right));
            left = Math.random() * (max - min) + min;
            right = Math.random() * (max - min) + min;
            Interval1D y = new Interval1D(Math.min(left, right), Math.max(left, right));
            interval2Ds[i] = new Interval2D(x, y);
            interval2Ds[i].draw();
        }

        int intersectCount = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (interval2Ds[i].intersects(interval2Ds[j])) {
                    intersectCount++;
                }
            }
        }
        System.out.println("intersect count: " + intersectCount);
    }
}
