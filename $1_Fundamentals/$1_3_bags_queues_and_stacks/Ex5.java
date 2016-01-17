package $1_fundamentals.$1_3_bags_queues_and_stacks;

import java.util.Stack;

/**
 * Created by hailstone01 on 1/12/16.
 */
public class Ex5 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int N = 50;
        while (N > 0) {
            stack.push( N % 2);
            N = N /2;
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
