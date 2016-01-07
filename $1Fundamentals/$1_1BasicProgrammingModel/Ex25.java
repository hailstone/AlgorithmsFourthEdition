package $1Fundamentals.$1_1BasicProgrammingModel;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex25 {
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    public static int anotherWay(int p, int q) {
        int result = q;
        while (result > 0) {
            if (p % result == 0 && q % result == 0) {
                return result;
            }
            result--;
        }

        return -1;
    }

    public static void main(String[] args) {
        int p = 323232;
        int q = 656578;
        System.out.println("gcd result: " + gcd(Math.max(p, q), Math.min(p, q)));
        System.out.println("anotherWay result: " + anotherWay(Math.max(p, q), Math.min(p, q)));
    }
}
