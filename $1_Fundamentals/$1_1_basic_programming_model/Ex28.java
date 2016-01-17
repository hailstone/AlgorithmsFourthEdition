package $1_fundamentals.$1_1_basic_programming_model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex28 {
    public static void print(List<Integer> list) {
        for (int item : list) {
            System.out.print(item + "\t");
        }
        System.out.println();
    }

    public static void removeDup(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            int j = i + 1;
            while (j < arrayList.size()) {
                if (arrayList.get(i) == arrayList.get(j)) {
                    arrayList.remove(j);
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("algs4-data/tinyW.txt"));

        ArrayList<Integer> whitelist = new ArrayList<Integer>();
        while (scanner.hasNext()) {
            whitelist.add(scanner.nextInt());
        }
        Collections.sort(whitelist);

        System.out.println("before: ");
        print(whitelist);

        removeDup(whitelist);
        System.out.println("after: ");
        print(whitelist);

    }
}
