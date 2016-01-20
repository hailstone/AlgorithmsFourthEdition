package $1_fundamentals.$1_4_analysis_of_algorithms;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/19/16.
 */
public class TwoSum {
    public static int count(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countFaster(int[] arr) {
        int count = 0;
        for (int i = 0, j = arr.length - 1; i < j;) {
            if (arr[i] + arr[j] > 0) {
                j--;
            } else if (arr[i] + arr[j] < 0) {
                i++;
            } else {
                count++;
                if (i + 1 < j && arr[i] == arr[i + 1]) {
                    i++;
                } else if (j - 1 > i && arr[j] == arr[j - 1]) {
                    j--;
                } else {
                    i++;
                    j--;
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
            arr[i] = StdRandom.uniform(-100000, 100000);
        }
        Arrays.sort(arr);

        Stopwatch stopwatch = new Stopwatch();
        int count = count(arr);
        double time = stopwatch.elapsedTime();
        System.out.println("normal algorithm\n" + "count: " + count + "\ttime: " + time);

        stopwatch = new Stopwatch();
        count = countFaster(arr);
        time = stopwatch.elapsedTime();
        System.out.println("faster algorithm\n" + "count: " + count + "\ttime: " + time);
    }
}
