package $1_fundamentals.$1_1_basic_programming_model;

/**
 * Created by hailstone01 on 1/6/16.
 */
public class Ex16 {
    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        }

        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    public static void main(String[] args) {
        System.out.println(exR1(6));
    }
}
