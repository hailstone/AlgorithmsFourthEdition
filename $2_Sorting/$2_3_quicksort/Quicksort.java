package $2_Sorting.$2_3_quicksort;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by hailstone01 on 1/31/16.
 */
public class Quicksort {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int mid = partition(arr, lo, hi);
        sort(arr, lo, mid - 1);
        sort(arr, mid + 1, hi);
    }

    public static int partition(int[] arr, int lo, int hi) {
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

    public static void exch(int[] arr, int i, int j) {
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

    public static void main(String[] args) {
        int N = 10;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = StdRandom.uniform(N);
        }

        System.out.println("before sorting: ");
        show(arr);
        sort(arr);
        System.out.println("after sorting: ");
        show(arr);
    }
}
