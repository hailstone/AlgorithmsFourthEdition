package $1_fundamentals.$1_1_basic_programming_model;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/6/16.
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.println(x < 1 && x > 0 && y < 1 && y > 0);
    }
}
