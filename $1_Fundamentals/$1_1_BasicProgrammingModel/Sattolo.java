package $1_Fundamentals.$1_1_BasicProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by hailstone01 on 1/8/16.
 */
public class Sattolo {
    public static void cycle(Object[] a) {
        int N = a.length;
        for (int i = N; i > 1; i--) {
            int r = (int) (Math.random() * (i - 1));
            Object swap = a[r];
            a[r] = a[i - 1];
            a[i - 1] = swap;
        }
    }

    public static void main(String[] args) {
//        String[] a = StdIn.readAllStrings();
        String[] a = {"a", "d", "f", "k"};
        Sattolo.cycle(a);

        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }
}
