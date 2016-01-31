package $2_Sorting.$2_5_applications;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * Created by hailstone01 on 1/31/16.
 */
public class FindMaxDup {
    public static int find(int[] arr) {
        Arrays.sort(arr);
        if (arr == null) {
            throw new NullPointerException();
        }

        int max = 0;
        int count = 1;
        for (int i = 0; i + 1 < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                max = max > count ? max : count;
                count = 1;
            }
        }
        return max;
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
        System.out.println(find(arr));
        show(arr);
    }
}
