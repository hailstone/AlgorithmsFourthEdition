package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by hailstone01 on 1/12/16.
 */
public class Ex10 {
    public static String convertToPostfix(String s) {
        Stack<String> operands = new Stack<String>();
        Stack<String> operators = new Stack<String>();

        for (String item : s.split("\\s")) {
            if ("(".equals(item)) {
                continue;
            } else if (")".equals(item)) {
                String a = operands.pop();
                String b = operands.pop();
                operands.push(b + a + operators.pop());
            } else if ("+-*/".indexOf(item) > -1) {
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

        System.out.println(convertToPostfix(s));
    }
}
