package $1_Fundamentals.$1_2_DataAbstraction;

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
