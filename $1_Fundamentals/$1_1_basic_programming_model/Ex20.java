package $1_fundamentals.$1_1_basic_programming_model;

/**
 * Created by hailstone01 on 1/6/16.
 */
public class Ex20 {
    public static double ln(int N) {
        if (N == 1) {
            return 0;
        }

        return ln(N - 1) + Math.log(N);
    }

    public static void main(String[] args) {
        System.out.println(ln(22));
    }
}
