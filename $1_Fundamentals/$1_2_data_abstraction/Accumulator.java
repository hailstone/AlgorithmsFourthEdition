package $1_fundamentals.$1_2_data_abstraction;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/9/16.
 */
public class Accumulator {
    private double total;
    private int N;

    public void addDataValue(double val) {
        N++;
        total += val;
    }

    public double mean() {
        return total / N;
    }

    public String toString() {
        return "Mean (" + N + " values): " + String.format("%7.5f", mean());
    }


    public static void main(String[] args) {
        int T = new Scanner(System.in).nextInt();
        Accumulator a = new Accumulator();

        for (int t = 0; t < T; t++) {
            a.addDataValue(StdRandom.random());
        }
        System.out.println(a);
    }
}
