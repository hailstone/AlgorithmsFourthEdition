package $1_fundamentals.$1_2_data_abstraction;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/9/16.
 */
public class VisualAccumulator {
    double total;
    int N;

    public VisualAccumulator(int tirals, int yScale) {
        StdDraw.setXscale(0, tirals);
        StdDraw.setYscale(0, yScale);
    }

    public void add(double value) {
        N++;
        total += value;
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(Color.black);
        StdDraw.point(N, value);
        StdDraw.setPenColor(Color.red);
        StdDraw.point(N, total / N);
    }

    public static void main(String[] args) throws InterruptedException {
        int T = new Scanner(System.in).nextInt();

        VisualAccumulator visualAccumulator = new VisualAccumulator(T, 1);
        for (int t = 0; t < T; t++) {
            visualAccumulator.add(Math.random());
        }
    }
}
