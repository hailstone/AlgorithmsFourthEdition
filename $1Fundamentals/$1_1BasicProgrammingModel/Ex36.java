package $1Fundamentals.$1_1BasicProgrammingModel;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex36 {
    public static int[] shuffle(int[] a) {
        int[] b = Arrays.copyOf(a, a.length);

        int N = b.length;
        for (int i = 0; i < N; i++) {
            int r = i + StdRandom.uniform(N - i);
            int temp = b[i];
            b[i] = b[r];
            b[r] = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int[] a = new int[M];
        for (int i = 0;i < a.length; i++) {
            a[i] = i;
        }

        int[][] result = new int[M][M];

        for (int i = 0; i < N; i++) {
            int[] singleResult = shuffle(a);
            for (int j = 0; j < M; j++) {
                result[singleResult[j]][j]++;
            }
        }

        System.out.println("the result: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%d\t", result[i][j]);
            }
            System.out.println();
        }
    }
}
