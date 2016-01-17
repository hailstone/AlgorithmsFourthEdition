package $1_fundamentals.$1_3_bags_queues_and_stacks;

import edu.princeton.cs.algs4.Stack;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/15/16.
 */
public class Ex45 {
    public static boolean isPossible(int N, int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        int index = 0;

        while (true) {
            if (stack.isEmpty()) {
                if (i < N) {
                    stack.push(i++);
                }
            }

            if (arr[index] == stack.peek()) {
                index++;
                stack.pop();
            } else {
                if (i < N) {
                    stack.push(i++);
                }
            }

            if (index == N) {
                return true;
            }

            if (i >= N && stack.peek() != arr[index]) {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(isPossible(N, arr));
    }
}
