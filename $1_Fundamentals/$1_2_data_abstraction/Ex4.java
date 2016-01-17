package $1_fundamentals.$1_2_data_abstraction;

/**
 * Created by hailstone01 on 1/10/16.
 */
public class Ex4 {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        System.out.println(string1);
        System.out.println(string2);
    }
}
