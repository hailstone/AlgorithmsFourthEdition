package $1_fundamentals.$1_1_basic_programming_model;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

/**
 * Created by hailstone01 on 1/8/16.
 */
public class BouncingBall {
    public static void main(String[] args) throws InterruptedException {
        double vx = (Math.random() * 2 - 1) / 200;
        double vy = (Math.random() * 2 - 1) / 200;

        double scale = 1.0;
        StdDraw.setXscale(-scale, scale);
        StdDraw.setYscale(-scale, scale);
        double x = Math.random() * scale;
        double y = Math.random() * scale;

        double radius = 0.1;
        StdDraw.setPenRadius(radius);
        StdDraw.setPenColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
        StdDraw.point(x, y);

        double range = scale - radius;
        while (true) {

            if (Math.abs(x) >= range) {
                StdDraw.setPenColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
                vx = -vx;
            }
            if (Math.abs(y) >= range) {
                StdDraw.setPenColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
                vy = -vy;
            }

            x += vx;
            y += vy;

            StdDraw.clear();
            StdDraw.point(x, y);
            StdDraw.show(2);
        }
    }
}
