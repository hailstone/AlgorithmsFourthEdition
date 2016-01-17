package $1_fundamentals.$1_1_basic_programming_model;

import edu.princeton.cs.algs4.StdDraw;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex32 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double l = scanner.nextDouble();
        double r = scanner.nextDouble();

        double[] data = new double[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = Math.random() * 10;
        }

        int[] distribution = new int[N];
        for (double item : data) {
            if (item < Math.min(l, r)) {
                continue;
            }
            int index = (int) ((item - Math.min(l, r)) / ((Math.abs(l - r)) / N));
            distribution[index]++;
        }

        int max = 0;
        for (int item : distribution) {
            if (max < item) {
                max = item;
            }
        }
        System.out.println("max is: " + max);

//        for (int item : distribution) {
//            System.out.println(item);
//        }

        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, max * 2);
        StdDraw.setPenRadius(0.01);
        for (int i = 0; i < distribution.length; i++) {
            double x = 1.0 / N * (i + 0.5);
            double y = distribution[i] / 2.0;
            double halfWidth = 1.0 / N / 2;
            double halfHeight = y * 2;

//            System.out.println(x + " " + y + " " + halfWidth + " " + halfHeight);

            StdDraw.rectangle(x, y, halfWidth, halfHeight);
//            Thread.sleep(500);
        }
    }
}
