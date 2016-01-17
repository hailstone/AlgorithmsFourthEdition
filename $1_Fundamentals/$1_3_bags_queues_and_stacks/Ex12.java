package $1_fundamentals.$1_3_bags_queues_and_stacks;

import java.util.Stack;

/**
 * Created by hailstone01 on 1/12/16.
 */
public class Ex12 {
    public static Stack<String> copy(Stack<String> stack) {
        return (Stack<String>) stack.clone();
    }

    public static void main(String[] args) {

    }
}
