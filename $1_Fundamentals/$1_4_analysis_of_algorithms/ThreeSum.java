package $1_fundamentals.$1_4_analysis_of_algorithms;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/17/16.
 */
public class ThreeSum {
    public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static int countFast(int[] a) {
        int N = a.length;
        Arrays.sort(a);
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Arrays.binarySearch(a, - a[i] - a[j]) > -1) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i< N; i++) {
            arr[i] = (int) (StdRandom.uniform(-1000000, 1000000));
        }

        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.countFast(arr);
        double time = timer.elapsedTime();

        System.out.println(cnt + " triples " + time);
    }
}
