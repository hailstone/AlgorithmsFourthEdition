package $2_Sorting.$2_1_elementary_sorts;

import edu.princeton.cs.algs4.StdDraw;

/**
 * Created by hailstone01 on 1/21/16.
 */
public class SelectionBars {
    public static void sort(double[] arr) throws InterruptedException {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (less(arr[j], arr[min])) {
                    min = j;
                }
            }
            exch(arr, i, min);
            showBar(arr);
        }
    }

    private static boolean less(double a, double b) {
        return a < b;
    }

    private static void exch(double[] arr, int i, int j) {
        double swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }

    public static void print(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.3f\t", arr[i]);
        }
        System.out.println();
    }

    public static void showBar(double[] arr) {
        StdDraw.clear();
        StdDraw.setXscale(0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            double x = i + 0.5;
            double y = arr[i] / 2;
            StdDraw.filledRectangle(x, y, 0.4, y);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int N = 300;
        double[] arr = new double[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }

        print(arr);
        sort(arr);
        System.out.println("after sort: ");
        print(arr);
    }
}
