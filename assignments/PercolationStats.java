package assignments;

import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;

/**
 * Created by hailstone01 on 1/30/16.
 */
public class PercolationStats {
    private ArrayList<Double> arrayList = new ArrayList<Double>();

    public PercolationStats(int N, int T) {
        if (N < 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < T; i++) {
            arrayList.add(runOnce(N));
        }
        System.out.println("mean\t= " + mean());
        System.out.println("stddev\t= " + stddev());
        System.out.println("95% confidence interval = " + confidenceLo() + ", " + confidenceHi());
    }

    private double runOnce(int N) {
        Percolation percolation = new Percolation(N);

        int count = 0;

        while (true) {
            if (percolation.percolates()) {
                return (double) count / (N * N);
            }
            int x = StdRandom.uniform(N) + 1;
            int y = StdRandom.uniform(N) + 1;
            if (percolation.isOpen(x, y)) {
                continue;
            }
            percolation.open(x, y);
            count++;
        }
    }

    public double mean() {
        double totalTime = 0;
        for (double item : arrayList) {
            totalTime += item;
        }

        return totalTime / arrayList.size();
    }

    public double stddev() {
        double totalTime = 0;
        for (double item : arrayList) {
            totalTime += item;
        }
        double mean = totalTime / arrayList.size();

        double totalDeviation = 0;
        for (double item : arrayList) {
            totalDeviation += Math.pow(item - mean, 2);
        }

        return Math.sqrt(totalDeviation / arrayList.size());
    }

    public double confidenceLo() {
        return mean() - stddev() * 1.96 / Math.sqrt(arrayList.size());
    }

    public double confidenceHi() {
        return mean() + stddev() * 1.96 / Math.sqrt(arrayList.size());

    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int T = Integer.parseInt(args[1]);
        PercolationStats percolationStats = new PercolationStats(N, T);
    }
}
