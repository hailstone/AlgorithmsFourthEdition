package $1_fundamentals.$1_1_basic_programming_model;

import edu.princeton.cs.algs4.StdDraw;

/**
 * Created by hailstone01 on 1/8/16.
 */
public class RightTriangle {
    public static void main(String[] args) {
        StdDraw.setScale(-1.1, 1.1);

        StdDraw.circle(0, 0, 1);

        double[] x = new double[3];
        double[] y = new double[3];
        x[0] = 1.0 / Math.sqrt(2);
        y[0] = -1.0 / Math.sqrt(2);

        x[1] = -1.0 / Math.sqrt(2);
        y[1] = 1.0 / Math.sqrt(2);

        x[2] = -1.0 / Math.sqrt(2);
        y[2] = -1.0 / Math.sqrt(2);

        StdDraw.filledPolygon(x, y);
    }
}
