package interview_questions;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hailstone01 on 2/18/16.
 */
public class Hanoi {
    public static void hanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            move(n, from, to);
            return;
        }

        hanoi(n - 1, from, aux, to);
        move(n, from, to);
        hanoi(n - 1, aux, to, from);
    }

    public static void move(int n, char from, char to) {
        System.out.println("move " + n + " from " + from + " to " + to);
    }

    public static void main(String[] args) {
        hanoi(2, 'A', 'B', 'C');
        Set set =new HashSet<>();
    }
}
