package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

import edu.princeton.cs.algs4.Queue;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/13/16.
 */
public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        Queue<String> q = new Queue<String>();
        while (scanner.hasNext()) {
            q.enqueue(scanner.next());
        }

        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.dequeue();
        }

        System.out.println(q.dequeue());
    }
}
