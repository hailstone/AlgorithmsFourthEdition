package $1_fundamentals.$1_1_basic_programming_model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userInputList = new ArrayList<String>();

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            userInputList.add(line);
        }

        for (String line : userInputList) {
            String name = line.split(" ")[0];
            int first = Integer.parseInt(line.split(" ")[1]);
            int second = Integer.parseInt(line.split(" ")[2]);
            System.out.printf("%10s%10d%10d%10.3f\n", name, first, second, (double) first / second);
        }
    }
}
