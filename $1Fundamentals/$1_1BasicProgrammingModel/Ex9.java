package $1Fundamentals.$1_1BasicProgrammingModel;

/**
 * Created by hailstone01 on 1/6/16.
 */
public class Ex9 {
    public static String convert(int N) {
        return Integer.toBinaryString(N);
    }

    public static String convert2(int N) {
        StringBuilder sb = new StringBuilder();
        while (N != 0) {
            sb.insert(0, Integer.toString(N % 2));
            N /= 2;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int N = 12;

        System.out.println(convert(N));
        System.out.println(convert2(N));
    }
}
