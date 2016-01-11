package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

import edu.princeton.cs.algs4.Stack;

/**
 * Created by hailstone01 on 1/11/16.
 */
public class Evaluate {
    public static double process(String s) throws Exception {
        Stack<String> operators = new Stack<String>();
        Stack<Double> operands = new Stack<Double>();

        for (String item : s.split("\\s")) {

            if ("(".equals(item) || item.length() == 0) {
                System.out.println("ignore");
            } else if ("+".equals(item) || "-".equals(item) || "*".equals(item) || "/".equals(item) || "sqrt".equals
                    (item)) {
                operators.push(item);
            } else if (")".equals(item)) {
                double a = operands.pop();
                String token = operators.pop();

                if ("+".equals(token)) {
                    double b = operands.pop();
                    System.out.println(a + " + " + b);
                    operands.push(a + b);
                } else if ("-".equals(token)) {
                    double b = operands.pop();
                    System.out.println(b + " - " + a);
                    operands.push(b - a);
                } else if ("*".equals(token)) {
                    double b = operands.pop();
                    System.out.println(a + " * " + b);
                    operands.push(a * b);
                } else if ("/".equals(token)) {
                    double b = operands.pop();
                    System.out.println(b + " / " + a);
                    operands.push(b / a);
                } else if ("sqrt".equals(token)) {
                    System.out.println("sqrt: " + a);
                    operands.push(Math.sqrt(a));
                } else {
                    throw new Exception("wrong operator");
                }
            } else {
                System.out.println("push value: " + item);
                operands.push(Double.valueOf(item));
            }
        }

        return operands.pop();
    }

    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
        String s = "( ( 1 + sqrt ( 5.0 ) ) / 2.0 )";
        System.out.println(process(s));
    }
}
