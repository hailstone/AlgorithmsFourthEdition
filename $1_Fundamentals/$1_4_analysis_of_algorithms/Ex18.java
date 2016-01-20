package $1_fundamentals.$1_4_analysis_of_algorithms;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/19/16.
 */
public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            int rand = StdRandom.uniform(-100, 100);
            if (arrayList.indexOf(rand) == -1) {
                arrayList.add(rand);
            }
        }

        System.out.println(arrayList);
        Integer[] temp = new Integer[arrayList.size()];
        Integer[] arr = arrayList.toArray(temp);
    }
}
