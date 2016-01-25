package $2_Sorting.$2_1_elementary_sorts;

/**
 * Created by hailstone01 on 1/22/16.
 */
public class Shell {
    public static void sort(double[] arr) {
        int N = arr.length;

        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = 0; i < N; i++) {
                for (int j = i; j >= h && less(arr[j], arr[j - h]); j -= h) {
                    exch(arr, j - 1, j);
                }
            }
            h /= 3;
        }
    }

    public static boolean less(double i, double j) {
        return i < j;
    }

    public static void exch(double[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static void print(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.3f\t", arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int N = 10;
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
