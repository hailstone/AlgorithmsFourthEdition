package $2_Sorting.$2_2_mergesort;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/26/16.
 * merger sort: bottom up
 */
public class MergeBU {
    public static void merge(Double[] a, Double[] aux, int lo, int mid, int hi) {
        for (int k = 0; k < a.length; k++) {
            aux[k] = a[k];
        }

        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (aux[i] < aux[j]) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }

    public static void sort(Double[] a) {
        Double[] aux = Arrays.copyOf(a, a.length);
        int step = 1;
        while (step < a.length) {
            for (int i = 0; ; i += 2 * step) {
                int lo = i;
                int hi = i + 2 * step - 1;
                int mid = lo + (hi - lo) / 2;
                if (mid >= a.length - 1) {
                    break;
                }

                if (hi >= a.length - 1) {
                    hi = a.length - 1;
                }

                merge(a, aux, lo, mid, hi);
            }
            step *= 2;
        }
    }

    private static void show(Double[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%.2f\t", a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        Double[] a = new Double[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.uniform();
        System.out.print("begin: ");
        show(a);
        sort(a);
        System.out.print("result: ");
        show(a);
    }
}
