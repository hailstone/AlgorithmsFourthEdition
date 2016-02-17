package $3_Searching;

/**
 * Created by hailstone01 on 2/1/16.
 */
public class Test {
    public static void permutation(String s) {
        permutation(s, "");
    }

    public static void permutation(String s, String temp) {
        if (s.length() == 0) {
            System.out.println(temp);
        }

        for (int i = 0; i < s.length(); i++) {
            permutation(s.substring(0, i) + s.substring(i + 1), temp + s.substring(i, i + 1));
        }
    }

    public static void main(String[] args) {
        String s = "abcd";
        permutation(s);
    }

}
