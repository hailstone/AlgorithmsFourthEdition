package $1_fundamentals.$1_2_data_abstraction;

/**
 * Created by hailstone01 on 1/10/16.
 */
public class Ex6 {
    public static boolean isCircularRotation(String s, String t) {
        if (s == null || t == null) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.equals(t.substring(i, t.length()) + t.substring(0, i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "ACTGACG";
        String t = "CTGACGA";
        System.out.println(isCircularRotation(s, t));
    }
}
