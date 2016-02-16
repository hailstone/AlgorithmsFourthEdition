package $3_Searching;

/**
 * Created by hailstone01 on 2/16/16.
 */
public class TD {
    private static int count = 0;

    public static void sort(int[] arr) {
        int[] aux = new int[arr.length];
        sort(arr, aux, arr.length - 1, 0);
    }

    public static void sort(int[] arr, int[] aux, int hi, int lo) {
        if (lo >= hi) return;

        int mid = lo + (hi - lo) / 2;
        sort(arr, aux, mid, lo);
        sort(arr, aux, hi, mid + 1);
        merge(arr, aux, lo, mid, hi);
    }

    public static void merge(int[] arr, int[] aux, int lo, int mid, int hi) {
        for (int m = lo; m <= hi; m++) {
            aux[m] = arr[m];
        }

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                arr[k] = aux[j++];
            } else if (j > hi) {
                arr[k] = aux[i++];
            } else if (aux[i] > aux[j]) {
                arr[k] = aux[j++];
            } else {
                arr[k] = aux[i++];
            }
        }

        count++;
        if (count == 7) {
            show(arr);
        }
    }

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {62, 12, 41, 78, 58, 86, 48, 45, 46, 75, 33, 35};
        sort(arr);
        show(arr);
    }
}
