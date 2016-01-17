package $1_fundamentals;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by hailstone01 on 1/5/16.
 */
public class Test {
    public static void cmp(Integer first, Integer second) {
        if (first < second)
            StdOut.printf("%d < %d\n", first, second);
        else if (first == second)
            StdOut.printf("%d == %d\n", first, second);
        else if (first > second)
            StdOut.printf("%d > %d\n", first, second);
        else
            StdOut.printf("%d and %d are incomparable\n", first, second);
    }

    public static void main(String[] args) {
        String s = null;
        System.out.println(s);
    }
}

