package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by hailstone01 on 1/12/16.
 */
public class Ex9 {
    public static int cal(String s) {
        Stack<Integer> operands = new Stack<Integer>();
        Stack<String> operators = new Stack<String>();

        for (String item : s.split("\\s")) {
            if (item.equals(")")) {
                int b = operands.pop();
                int a = operands.pop();

                String operator = operators.pop();
                if ("+".equals(operator)) {
                    operands.push(a + b);
                } else if ("-".equals(operator)) {
                    operands.push(a - b);
                } else if ("*".equals(operator)) {
                    operands.push(a * b);
                } else if ("/".equals(operator)) {
                    operands.push(a / b);
                } else {
                    System.out.println("wrong operator");
                }
            } else if ("+".equals(item) || "-".equals(item) || "*".equals(item) || "/".equals(item)) {
                operators.push(item);
            } else {
                operands.push(Integer.valueOf(item));
            }
        }

        return operands.pop();
    }

    public static String insert(String s) {
        Stack<String> operands = new Stack<String>();
        Stack<String> operators = new Stack<String>();

        for (String item : s.split("\\s")) {
            if (")".equals(item)) {
                String b = operands.pop();
                String a = operands.pop();
                operands.push(String.format("(%s%s%s)", a, operators.pop(), b));
            } else if ("+".equals(item) || "-".equals(item) || "*".equals(item) || "/".equals(item)) {
                operators.push(item);
            } else {
                operands.push(item);
            }
        }
        return operands.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(cal(s));
        System.out.println(insert(s));
    }
}
