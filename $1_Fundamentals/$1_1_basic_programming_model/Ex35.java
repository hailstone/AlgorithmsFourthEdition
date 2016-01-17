package $1_fundamentals.$1_1_basic_programming_model;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex35 {
    public static void theory() {
        final int SIDES = 6;
        double[] dist = new double[2 * SIDES + 1];
        for (int i = 1; i <= SIDES; i++) {
            for (int j = 1;j <= SIDES; j++) {
               dist[i + j]++;
            }
        }

        System.out.println("theoretically:");
        for (int k = 2; k <= 2 * SIDES; k++) {
            dist[k] /= 36.0;
            System.out.printf("%.3f\t", dist[k]);
        }
    }

    public static void reality() {
        int times = 100000;
        double[] dist = new double[13];
        for (int i = 0; i < times; i++) {
            int num = (int) (Math.random() * 6 + 1) + (int) (Math.random() * 6 + 1);
            dist[num] += 1;
        }

        System.out.println("reality:");
        for (int k = 2; k < 13; k++) {
            dist[k] /= times;
            System.out.printf("%.3f\t", dist[k]);
        }
    }

    public static void main(String[] args) {
        theory();
        System.out.println();
        reality();
    }
}
