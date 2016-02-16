package $3_Searching;

import java.util.Scanner;

/**
 * Created by hailstone01 on 2/1/16.
 */
public class Test {
    public static void selectsort(int[] arr) {
        for (int i = 0; i < 4; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            exch(arr, i, minIndex);
        }
    }

    public static void shellsort(int[] arr) {
        int step = 1;
        while(step < arr.length / 3) {
            step = step * 3 + 1;
        }

        for (; step >= 4; step /= 3) {
            System.out.println(step);
            for (int i = step; i < arr.length; i++) {
                for (int j = i; j >= step && arr[j] < arr[j - step]; j -= step) {
                    exch(arr, j, j - step);
                }
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
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        shellsort(arr);
        show(arr);
    }
}
