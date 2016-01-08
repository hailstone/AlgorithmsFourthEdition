package $1_Fundamentals.$1_1_BasicProgrammingModel;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex24 {
    public static int gcd(int p, int q) {
        System.out.println("p: " + p + " q: " + q);

        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        int a = 1111111;
        int b = 1234567;
        System.out.println(gcd(Math.max(a, b), Math.min(a, b)));
    }
}
