package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/15/16.
 */
public class Ex37 {
    public static void eliminate(int N, int M) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
        }

        int current = 0;
        while (arrayList.size() != 0) {
            current += M - 1;
            current = current % arrayList.size();
            System.out.println(arrayList.remove(current));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        eliminate(N, M);
    }
}
