package $1_fundamentals.$1_1_basic_programming_model;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/6/16.
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a == b && b == c);
    }
}
