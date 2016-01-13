package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Transaction;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/13/16.
 */
public class Ex17 {
    public static Transaction[] readTransactions() {
        Scanner scanner = new Scanner(System.in);

        Queue<Transaction> q = new Queue<Transaction>();
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] items = s.split("\\s");
            String[] dateItems = items[1].split("/");
            Date date = new Date(Integer.valueOf(dateItems[0]), Integer.valueOf(dateItems[1]), Integer.valueOf
                    (dateItems[2]));
            Transaction tran = new Transaction(items[0], date, Double.valueOf(items[2]));
            q.enqueue(tran);
        }

        Transaction[] trans = new Transaction[q.size()];
        for (int i = 0; i < trans.length; i++) {
            trans[i] = q.dequeue();
        }

        return trans;
    }

    public static void main(String[] args) {
        Transaction[] trans = readTransactions();

        for (Transaction tran : trans) {
            System.out.println(tran);
        }
    }
}
