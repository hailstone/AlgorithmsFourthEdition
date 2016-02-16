package $3_Searching;

/**
 * Created by hailstone01 on 2/16/16.
 */
public class BU {
    private static int count = 0;
    public static void sort(int[] arr) {
        int[] aux = new int[arr.length];
        for (int step = 1; step < arr.length; step *= 2) {
            for (int i = 0; i + step - 1 < arr.length; i = i + 2 * step) {
                merge(arr, aux, i, i + step - 1, Math.min(i + 2 * step - 1, arr.length - 1));
            }
        }
    }

    public static void merge(int[] arr, int[] aux, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = arr[i];
        }

        for (int i = lo, j = mid + 1, k = lo; k <= hi; k++) {
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
        int[] arr = {27, 84, 19, 42, 22, 39, 78, 70, 13, 91};
        sort(arr);
        show(arr);
    }
}
