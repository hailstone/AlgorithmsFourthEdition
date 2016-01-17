package $1_fundamentals.$1_2_data_abstraction;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/8/16.
 */
public class Flips {
    public static void main(String[] args) {
        int T = new Scanner(System.in).nextInt();

        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        for (int t = 0; t < T; t++) {
            if (StdRandom.bernoulli(0.5)) {
                heads.increment();
            } else {
                tails.increment();
            }
        }

        System.out.println(heads);
        System.out.println(tails);

        int d = heads.tally() - tails.tally();
        System.out.println("delta: " + Math.abs(d));
    }
}
