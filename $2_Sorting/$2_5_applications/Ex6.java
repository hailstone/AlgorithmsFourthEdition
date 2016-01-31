package $2_Sorting.$2_5_applications;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by hailstone01 on 1/31/16.
 */
public class Ex6 {
    public static int select(int[] arr, int n) throws Exception {
        if (n < 0 || n >= arr.length) {
            throw new IndexOutOfBoundsException();
        }

        return select(arr, n, 0, arr.length - 1);
    }

    public static int select(int[] arr, int n, int lo, int hi) throws Exception {
        int mid = partition(arr, lo, hi);
        if (mid == n) {
            return arr[n];
        } else if (mid > n) {
            return select(arr, n, lo, mid - 1);
        } else if (mid < n) {
            return select(arr, n, mid + 1, hi);
        }

        throw new Exception();
    }

    private static int partition(int[] arr, int lo, int hi) {
        if (lo == hi) {
            return lo;
        }

        int i = lo + 1;
        int j = hi;
        while (true) {
            if (i == j) {
                if (arr[lo] > arr[j]) {
                    exch(arr, lo, j);
                    return j;
                } else {
                    return lo;
                }
            } else if (arr[j] >= arr[lo]) {
                j--;
            } else if (arr[i] <= arr[lo]) {
                i++;
            } else if (arr[i] > arr[lo] && arr[j] < arr[lo]) {
                exch(arr, i, j);
            }
        }
    }

    private static void exch(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void show(int[] arr) {
        for (int item : arr) {
            System.out.print(item + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int N = 10;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = StdRandom.uniform(N);
        }

        show(arr);
        System.out.println(select(arr, 0));
    }
}
