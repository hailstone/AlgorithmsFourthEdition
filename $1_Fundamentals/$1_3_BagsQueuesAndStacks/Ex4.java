package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/12/16.
 */
public class Ex4 {
    private static class Stack {
        char[] arr;
        int currentIndex = 0;

        public Stack(int capacity) {
            arr = new char[capacity];
        }

        public void push(char c) {
            arr[currentIndex++] = c;
        }

        public char pop() {
            return arr[--currentIndex];
        }

        public boolean isEmpty() {
            return currentIndex == 0;
        }
    }

    public static boolean isBalanced(String s) {
        Stack stack = new Stack(s.length());

        for (char c : s.toCharArray()) {
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (c == ')' && stack.pop() == '(') {
                    continue;
                }
                if (c == ']' && stack.pop() == '[') {
                    continue;
                }
                if (c == '}' && stack.pop() == '{') {
                    continue;
                }
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(isBalanced(s));
    }
}
