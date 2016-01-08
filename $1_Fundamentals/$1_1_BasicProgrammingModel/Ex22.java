package $1_Fundamentals.$1_1_BasicProgrammingModel;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex22 {
    public static int rank(int[] arr, int n, int lo, int hi, int depth) {
        if (lo > hi) {
            return -1;
        }

        for (int i = 0; i < depth; i++) {
            System.out.print("\t");
        }

        System.out.println("lo: " + lo + " hi: " + hi);

        int mid = (lo + hi) / 2;
        if (n > arr[mid]) {
            return rank(arr, n, mid + 1, hi, depth + 1);
        } else if (n < arr[mid]) {
            return rank(arr, n, lo, mid - 1, depth + 1);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 33, 55, 88, 111, 222, 333, 444, 555, 666, 777, 888, 999};
        int n = 1;
        System.out.println(rank(arr, n, 0, arr.length, 0));
    }
}
