package $1Fundamentals.$1_1BasicProgrammingModel;

import edu.princeton.cs.algs4.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex39 {
    public static int findCommonNum(int[] a, int[] b) {
        Arrays.sort(a);

        int count = 0;
        for (int item : b) {
            if (BinarySearch.indexOf(a, item) >= 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int[] arrN = {(int) Math.pow(10, 3), (int) Math.pow(10, 4), (int) Math.pow(10, 5), (int) Math.pow(10, 6)};
            for (int N : arrN) {
                int[] arrA = new int[N];
                int[] arrB = new int[N];

                for (int j = 0; j < N; j++) {
                    arrA[j] = (int) (Math.random() * 900000 + 100000);
                    arrB[j] = (int) (Math.random() * 900000 + 100000);
                }

                System.out.print("when N = " + N + "\t");
                System.out.println(findCommonNum(arrA, arrB));
                System.out.println();
            }
        }
    }
}
