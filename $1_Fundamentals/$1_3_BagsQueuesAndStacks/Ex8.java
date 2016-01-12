package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by hailstone01 on 1/12/16.
 */
public class Ex8 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.next();
            if ("-".equals(s)) {
                stack.pop();
            } else {
                stack.push(s);
            }
        }

        System.out.println("the size: " + stack.size());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
