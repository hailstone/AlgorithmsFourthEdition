package $1_fundamentals.$1_1_basic_programming_model;

/**
 * Created by hailstone01 on 1/6/16.
 */
public class Ex19Fibonacci {
    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static void anotherWay(int N) {
        int[] arr = new int[N];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < N; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println("the results");
        for (int i = 0; i < N; i++) {
            System.out.println(i + " " + arr[i]);
        }
    }

    public static void main(String[] args) {
        for (int N = 0; N < 55; N++) {
            System.out.println(N + " " + F(N));
        }

//        anotherWay(55);
    }
}
