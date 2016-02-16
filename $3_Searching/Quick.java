package $3_Searching;

import java.util.LinkedList;

/**
 * Created by hailstone01 on 2/16/16.
 */
public class Quick {
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
        int mid = lo + (hi - lo) / 2;
        int i = lo + 1, j = hi;
        while (true) {
            if (i == j) {
                if (arr[lo] <= arr[i]) {
                    return lo;
                } else {
                    exch(arr, lo, i);
                    return i;
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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {17, 77, 53, 24, 42, 60, 12, 72, 43, 15, 30, 20};
        int[] arr2 = {46, 80, 49, 74, 60, 36, 91, 46, 21, 51};
        sort(arr1);
        sort(arr2);
        show(arr1);
        show(arr2);
        LinkedList<Integer> ll = new LinkedList<Integer>();

    }
}
