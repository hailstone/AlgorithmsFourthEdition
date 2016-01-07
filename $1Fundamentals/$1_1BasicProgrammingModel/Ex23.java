package $1Fundamentals.$1_1BasicProgrammingModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex23 {
    public static int binarySearch(Integer[] arr, int n, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }

        int mid = (lo + hi) / 2;
        if (n > arr[mid]) {
            return binarySearch(arr, n, mid + 1, hi);
        } else if (n < arr[mid]) {
            return binarySearch(arr, n, lo, mid - 1);
        } else  {
            return mid;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner whitelistScanner = new Scanner(new File("algs4-data/tinyW.txt"));
        Scanner testDataScanner = new Scanner(new File("algs4-data/tinyT.txt"));
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> whiteListArrayList = new ArrayList<Integer>();
        while (whitelistScanner.hasNext()) {
            whiteListArrayList.add(whitelistScanner.nextInt());
        }
        Collections.sort(whiteListArrayList);
        Integer[] whitelist = new Integer[whiteListArrayList.size()];
        whiteListArrayList.toArray(whitelist);

        ArrayList<Integer> testDataArrayList = new ArrayList<Integer>();
        while (testDataScanner.hasNext()) {
            testDataArrayList.add(testDataScanner.nextInt());
        }

        System.out.println("please input a token(+ or -)");
        String token = scanner.next();

        for (int testItem : testDataArrayList) {
            int result = binarySearch(whitelist, testItem, 0, whiteListArrayList.size() - 1);
            if ("+".equals(token) && result < 0 || "-".equals(token) && result >= 0) {
                System.out.println(testItem);
            }
        }
    }
}
