package $1_Fundamentals.$1_2_DataAbstraction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/10/16.
 */
public class Ex15 {
    public static Integer[] readInts(String name) throws FileNotFoundException {
        File file = new File(name);
        Scanner scanner = new Scanner(file);
        ArrayList<Object> arrayList = new ArrayList<>();

        while (scanner.hasNext()) {
            arrayList.add(scanner.nextInt());
        }
        Integer[] result = new Integer[arrayList.size()];
        arrayList.toArray(result);

        return result;
    }

    public static void main(String[] args) {

    }
}
