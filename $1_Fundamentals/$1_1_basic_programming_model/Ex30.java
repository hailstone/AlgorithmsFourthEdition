package $1_fundamentals.$1_1_basic_programming_model;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex30 {
    public static void createArray(int N) {
        boolean[][] arr = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = isPrime(i, j);
            }
        }

        System.out.println("array created, it's: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int i, int j) {
        for (int k = 2; k < Math.min(i, j); k++) {
            if (i % 2 == 0 && j % 2 == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        createArray(12);
    }
}
