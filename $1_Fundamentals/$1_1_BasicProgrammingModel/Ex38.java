package $1_Fundamentals.$1_1_BasicProgrammingModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex38 {
    public static int binarySearch(Integer[] arr, int key, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }

        int mid = (lo + hi) / 2;
        if (key < arr[mid]) {
            return binarySearch(arr, key, lo, mid - 1);
        } else if (key > arr[mid]) {
            return binarySearch(arr, key, mid + 1, hi);
        } else {
            return mid;
        }
    }

    public static int bruteForceSearch(Integer[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner whitelistScanner = new Scanner(new File("algs4-data/largeW.txt"));
        Scanner dataScanner = new Scanner(new File("algs4-data/largeT.txt"));

        ArrayList<Integer> whitelist = new ArrayList<Integer>();
        ArrayList<Integer> data = new ArrayList<Integer>();

        while (whitelistScanner.hasNext()) {
            whitelist.add(whitelistScanner.nextInt());
        }
        Collections.sort(whitelist);
        Integer[] arr = new Integer[whitelist.size()];
        whitelist.toArray(arr);

        while (dataScanner.hasNext()) {
            data.add(dataScanner.nextInt());
        }

        int count = 0;
        for (int item : data) {
            if (binarySearch(arr, item, 0, whitelist.size()) < 0) {
                count++;
            }
        }
        System.out.println(count + " illegal nums");

        count = 0;
        for (int item : data) {
            if (bruteForceSearch(arr, item) < 0) {
                count++;
            }
        }
        System.out.println(count + " illegal nums");
    }
}
