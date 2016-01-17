package $1_fundamentals.$1_1_basic_programming_model;

/**
 * Created by hailstone01 on 1/6/16.
 */
public class Ex15 {
    public static int[] histogram(int[] a, int M) {
        int[] result = new int[M];

        for (int item : a) {
            if (item < M) {
                result[item]++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 1, 7};
        int M = 5;

        int[] result = histogram(arr, M);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
