package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by hailstone01 on 1/12/16.
 */
public class Ex11_EvaluatePostfix {
    public static Double evaluate(String s) {
        Stack<Double> operands = new Stack<Double>();

        for (String item : s.split("\\s")) {
            if ("+-*/".indexOf(item) > -1) {
                double a = operands.pop();
                double b = operands.pop();

                if ("+".equals(item)) {
                    operands.push(b + a);
                } else if ("-".equals(item)) {
                    operands.push(b - a);
                } else if ("*".equals(item)) {
                    operands.push(b * a);
                } else if ("/".equals(item)) {
                    operands.push(b / a);
                }
            } else {
                operands.push(Double.valueOf(item));
            }
        }

        return operands.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(evaluate(s));
    }
}
