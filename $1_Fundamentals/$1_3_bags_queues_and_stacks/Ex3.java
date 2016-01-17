package $1_fundamentals.$1_3_bags_queues_and_stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by hailstone01 on 1/12/16.
 */
public class Ex3 {
    public static boolean isPossible(String string) {
        Stack<Integer> stack = new Stack<Integer>();
        int N = 0;

        for (String s : string.split("\\s")) {
            int i = Integer.valueOf(s);

            while (true) {

                if (N > 9 && stack.isEmpty()) {
                    return false;
                }

                if (N > 9 && stack.peek() != i) {
                    return false;
                }

                if (!stack.isEmpty() && stack.peek() == i) {
                    stack.pop();
                    break;
                }

                if (!stack.isEmpty() && stack.peek() != i) {
                    stack.push(N++);
                }

                if (stack.isEmpty() && N < 10) {
                    stack.push(N++);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(isPossible(s));
    }
}
