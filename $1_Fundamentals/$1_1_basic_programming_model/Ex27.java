package $1_fundamentals.$1_1_basic_programming_model;

import edu.princeton.cs.algs4.Counter;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex27 {
    public static double binomial(int N, int k, double p, Counter c) {
        c.increment();

        if ((N == 0) && (k == 0)) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }

        return (1.0 - p) * binomial(N - 1, k, p, c) + p * binomial(N - 1, k - 1, p, c);
    }

    public static void main(String[] args) {
        Counter counter = new Counter("calls");
        System.out.println(binomial(10, 5, 0.5, counter));
        System.out.println(counter);
    }
}
