package $1_Fundamentals.$1_2_DataAbstraction;

/**
 * Created by hailstone01 on 1/10/16.
 */
public class Ex7 {
    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1) {
            return s;
        }

        String a = s.substring(0, N / 2);
        String b = s.substring(N / 2, N);
        return mystery(b) + mystery(a);
    }

    public static void main(String[] args) {
        System.out.println(mystery("abcd"));
    }

    public static String reverse(String s) {
        if (s == null) {
            return null;
        }

        if (s.length() <= 1) {
            return s;
        }

        return reverse(s.substring(s.length() / 2, s.length())) +
                reverse(s.substring(0, s.length() / 2));

    }
}
