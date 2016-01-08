package $1_Fundamentals.$1_1_BasicProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by hailstone01 on 1/6/16.
 */
public class Ex6 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
