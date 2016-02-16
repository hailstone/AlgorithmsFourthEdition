package assignments;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created by hailstone01 on 2/5/16.
 */
public class Subset {
    private static void exch(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int k = Integer.valueOf(args[0]);
        String s = StdIn.readLine();

        String[] arr = s.split("\\s");
        for (int i = 1; i < arr.length; i++) {
            int j = (int) (Math.random() * i);
            exch(arr, i, j);
        }

        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
    }
}
