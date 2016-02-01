package $2_Sorting.$2_5_applications;

import java.util.Arrays;

/**
 * Created by hailstone01 on 1/31/16.
 */
public class Ex11 {
    public static void heapsort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            sink(arr, i, arr.length);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            exch(arr, 0, i);
            sink(arr, 0, i);
        }
    }

    public static void sink(int[] arr, int index, int range) {
        while (range > index * 2 + 1) {
            int i = index * 2 + 1;
            if (range > index * 2 + 2 && arr[index * 2 + 2] > arr[index * 2 + 1]) {
                i++;
            }

            if (arr[index] < arr[i]) {
                exch(arr, index, i);
                index = i;
            } else {
                return;
            }
        }
    }

    public static void quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    public static void quicksort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int mid = partition(arr, lo, hi);
        quicksort(arr, lo, mid - 1);
        quicksort(arr, mid + 1, hi);
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

    public static void mergeSort2(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int mid = lo + (hi - lo) / 2;
        mergeSort2(arr, lo, mid);
        mergeSort2(arr, mid + 1, hi);
        merge(arr, lo, mid, hi);
    }

    public static void mergeSort(int[] arr) {
        int[] p = new int[arr.length];
        for (int i = 0; i < p.length; i++) {
            p[i] = i;
        }

        for (int step = 1; step < arr.length; step *= 1) {
            for (int i = 0; i + step - 1 < arr.length; i += 2 * step - 1) {
                merge(arr, i, i + step - 1, i + 2 * step - 1);
            }
        }

        System.out.println("after merge sort, the permutation is: ");
        show(p);
    }

    public static void merge(int[] arr, int lo, int mid, int hi) {
        int[] temp = Arrays.copyOf(arr, arr.length);
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                arr[k] = temp[j++];
            } else if (j > hi) {
                arr[k] = temp[i++];
            } else if (temp[i] < temp[j]) {
                arr[k] = temp[i++];
            } else {
                arr[k] = temp[j++];
            }
        }
    }


    public static void shellSort(int[] arr) {
        int[] p = new int[arr.length];
        for (int i = 0; i < p.length; i++) {
            p[i] = i;
        }

        int step = 1;
        while (3 * step < arr.length) {
            step = step * 3 + 1;
        }

        for (; step > 0; step /= 3) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j - step >= 0 && arr[j] < arr[j - step]; j -= step) {
                    exch(arr, j, j - step);
                }
            }
        }

        System.out.println("after shell sort, the permutation is: ");
        show(p);
    }


    public static void insertionSort(int[] arr) {
        int[] p = new int[arr.length];
        for (int i = 0; i < p.length; i++) {
            p[i] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; i--) {
                exch(arr, j, j - 1);
            }
        }

        System.out.println("after insertion sort, the permutation is: ");
        show(p);
    }

    public static void selectSort(int[] arr) {
        int[] p = new int[arr.length];
        for (int i = 0; i < p.length; i++) {
            p[i] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            exch(arr, i, minIndex);
        }

        System.out.println("after selection sort: ");
        show(p);
    }

    public static void show(int[] arr) {
        for (int item : arr) {
            System.out.print(item + "\t");
        }
        System.out.println();
    }

    public static void exch(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        insertionSort(arr);
        selectSort(arr);
        shellSort(arr);
    }
}
