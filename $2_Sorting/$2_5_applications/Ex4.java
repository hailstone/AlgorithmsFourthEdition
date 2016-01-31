package $2_Sorting.$2_5_applications;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by hailstone01 on 1/31/16.
 */
public class Ex4 {
    public static String[] dedup(String[] arr) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String s : arr) {
            if (!arrayList.contains(s)) {
                arrayList.add(s);
            }
        }
        Collections.sort(arrayList);
        String[] temp = new String[arrayList.size()];
        arrayList.toArray(temp);
        return temp;
    }

    public static void show(String[] arr) {
        for (String item : arr) {
            System.out.print(item + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] arr = {"adf", "fad", "ad", "df", "da", "ad", "ff", "adf"};

        System.out.println("before: ");
        show(arr);
        String[] result = dedup(arr);
        System.out.println("after: ");
        show(result);
    }
}