package $1Fundamentals.$1_1BasicProgrammingModel;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/8/16.
 */
public class Wget {
    public static void main(String[] args) throws IOException {
//        String url = args[0];
        String url = "http://introcs.cs.princeton.edu/data/codes.csv";
        InputStream inputStream = new URL(url).openStream();
        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            System.out.print(scanner.next());
        }
    }
}
