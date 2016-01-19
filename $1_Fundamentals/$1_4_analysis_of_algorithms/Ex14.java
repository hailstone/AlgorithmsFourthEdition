package $1_fundamentals.$1_4_analysis_of_algorithms;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/19/16.
 */
public class Ex14 {
    public static int count(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    for (int m = k + 1; m < arr.length; m++) {
                        if (arr[i] + arr[j] + arr[k] + arr[m] == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = StdRandom.uniform(-N, N);
        }

        Stopwatch stopwatch = new Stopwatch();
        System.out.println(count(arr));
        System.out.println(stopwatch.elapsedTime());
    }
}
