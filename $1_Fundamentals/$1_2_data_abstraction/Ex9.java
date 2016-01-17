package $1_fundamentals.$1_2_data_abstraction;

import edu.princeton.cs.algs4.Counter;

/**
 * Created by hailstone01 on 1/10/16.
 */
public class Ex9 {
    public static int binarySearch(int[] arr, int key, int lo, int hi, Counter c) {
        if (lo > hi || arr == null) {
            return -1;
        }

        int mid = (lo + hi) / 2;
        c.increment();

        if (key > arr[mid]) {
            return binarySearch(arr, key, mid + 1, hi, c);
        } else if(key < arr[mid]) {
            return binarySearch(arr, key, lo, mid - 1, c);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        Counter c = new Counter("times");
        int[] arr = {1,3,5,7,9,22,44,66,88};
        int key = 32;
        System.out.println(binarySearch(arr, key, 0, arr.length, c));
        System.out.println(c);
    }
}
