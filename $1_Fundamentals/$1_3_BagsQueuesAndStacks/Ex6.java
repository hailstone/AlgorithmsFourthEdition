package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by hailstone01 on 1/12/16.
 */
public class Ex6 {
    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<String>();
        q.add("aa");
        q.add("bb");
        q.add("cc");

        Stack<String> stack = new Stack<String>();
        while (!q.isEmpty()) {
            stack.push(q.poll());
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
