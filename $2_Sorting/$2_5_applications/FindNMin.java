package $2_Sorting.$2_5_applications;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by hailstone01 on 1/31/16.
 */
public class FindNMin {
    public static int find(int[] arr, int n) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = partition(arr, lo, hi);
            if (mid == n) {
                return arr[n];
            } else if (mid > n) {
                hi = mid - 1;
            } else if (mid < n) {
                lo = mid + 1;
            }
        }
        return -1;
    }

    public static int partition(int[] arr, int lo, int hi) {
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
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = StdRandom.uniform(N);
        }

        show(arr);
        System.out.println(find(arr, 2));
    }
}
