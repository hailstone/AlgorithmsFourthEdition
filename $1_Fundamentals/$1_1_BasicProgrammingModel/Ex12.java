package $1_Fundamentals.$1_1_BasicProgrammingModel;

/**
 * Created by hailstone01 on 1/6/16.
 */
public class Ex12 {
    public static void main(String[] args) {
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }

        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}