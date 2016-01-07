package $1Fundamentals.$1_1BasicProgrammingModel;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int t;
        if (a > b) {
            t = a; a = b; b = t;
        }

        if (a > c) {
            t = a; a = c; c = t;
        }

        if (b > c) {
            t = b; b = c; c = t;
        }

        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
    }
}
