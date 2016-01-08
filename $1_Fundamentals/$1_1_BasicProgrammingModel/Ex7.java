package $1_Fundamentals.$1_1_BasicProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by hailstone01 on 1/6/16.
 */
public class Ex7 {
    public static void fragA() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
        }

        StdOut.printf("%.5f\n", t);
    }

    public static void fragB() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }

    public static void fragC() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }

    public static void main(String[] args) {
        fragA();
        fragB();
        fragC();
    }
}
