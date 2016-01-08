package $1_Fundamentals.$1_1_BasicProgrammingModel;

/**
 * Created by hailstone01 on 1/6/16.
 */
public class Ex17 {
    public static String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) {
            return "";
        }
        return s;
    }

    public static void main(String[] args) {
        //stackoverflow error
        exR2(3);
    }
}
