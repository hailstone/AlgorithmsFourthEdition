package $1_Fundamentals.$1_2_DataAbstraction;

import java.awt.geom.Point2D;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/9/16.
 */
public class Ex1_Point2D {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();

        Point2D[] coordinates = new Point2D[N];
        for (int i = 0; i < N; i++) {
            coordinates[i] = new Point2D.Double(Math.random(), Math.random());
        }

        double minDis = Double.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (minDis > coordinates[i].distance(coordinates[j])) {
                    minDis = coordinates[i].distance(coordinates[j]);
                }
            }
        }

        System.out.println("the closest distance is: " + minDis);
    }
}
