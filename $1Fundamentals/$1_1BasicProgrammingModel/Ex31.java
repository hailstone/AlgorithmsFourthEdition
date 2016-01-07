package $1Fundamentals.$1_1BasicProgrammingModel;

import edu.princeton.cs.algs4.StdDraw;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex31 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double p = scanner.nextDouble();

//        int N = 10;
//        double p = 0.5;

        StdDraw.setScale(-1.5, 1.5);
        StdDraw.setPenRadius(0.002);
        StdDraw.circle(0, 0, 1);

        double[][] coordinates = new double[N][2];

        // 1 degree = radian * PI / 180
        StdDraw.setPenRadius(0.05);
        for (int i = 0; i < N; i++) {
            double x = Math.cos(360.0 / N * i * Math.PI / 180);
            double y = Math.sin(360.0 / N * i * Math.PI / 180);
            coordinates[i][0] = x;
            coordinates[i][1] = y;
            StdDraw.point(x, y);
        }

        StdDraw.setPenRadius(0.002);
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (Math.random() < p) {
                    Thread.sleep(10);
                    StdDraw.line(coordinates[i][0], coordinates[i][1], coordinates[j][0], coordinates[j][1]);
                }
            }
        }
    }
}
