package $2_Sorting.$2_4_priority_queues;

import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Transaction;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by hailstone01 on 1/27/16.
 */
public class TopM {
    private TopM() {}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        MinPQ<Transaction> pq = new MinPQ<Transaction>(M + 1);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Transaction transaction = new Transaction(line);
            pq.insert(transaction);

            if (pq.size() > M) {
                pq.delMin();
            }
        }

        Stack<Transaction> stack = new Stack<Transaction>();
        for (Transaction transaction : pq) {
            stack.push(transaction);
        }

        for (Transaction transaction : stack) {
            System.out.println(transaction);
        }
    }
}
