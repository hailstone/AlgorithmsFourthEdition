package $3_Searching.$3_1_Symbol_tables;

import java.util.Scanner;

/**
 * Created by hailstone01 on 2/2/16.
 */
public class GPA {
    private String[] keys = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D", "F"};
    private Double[] vals = {4.33, 4.00, 3.67, 3.33, 3.00, 2.67, 2.33, 2.00, 1.67, 1.00, 0.00};

    public double find(String key) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].equals(key)) {
                return vals[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        GPA gpa = new GPA();
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int count = 0;
        while (scanner.hasNext()) {
            total += gpa.find(scanner.next());
            count++;
        }
        System.out.println("average score: " + total / count);
    }
}
