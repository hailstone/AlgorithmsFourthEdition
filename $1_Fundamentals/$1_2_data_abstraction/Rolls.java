package $1_fundamentals.$1_2_data_abstraction;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/8/16.
 */
public class Rolls {
    public static void main(String[] args) {
        int T = new Scanner(System.in).nextInt();
        int SIDES = 6;
        Counter[] rolls = new Counter[SIDES + 1];
        for (int i = 1; i <= SIDES; i++) {
            rolls[i] = new Counter(i + "'s");
        }

        for (int t = 0; t < T; t++) {
            int result = StdRandom.uniform(1, SIDES + 1);
            rolls[result].increment();
        }

        for (int i = 1; i <= SIDES; i++) {
            System.out.println(rolls[i]);
        }
    }
}
