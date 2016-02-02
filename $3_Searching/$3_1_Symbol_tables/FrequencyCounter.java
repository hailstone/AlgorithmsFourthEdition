package $3_Searching.$3_1_Symbol_tables;

import edu.princeton.cs.algs4.StdOut;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by hailstone01 on 2/1/16.
 */
public class FrequencyCounter {
    public static void main(String[] args) throws FileNotFoundException {
        int minlen = Integer.parseInt(new Scanner(System.in).next());
        SequentialSearchST<String, Integer> st = new SequentialSearchST<String, Integer>();
        Scanner scanner = new Scanner(new File("algs4-data/tale.txt"));

        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.length() < minlen) {
                continue;
            }
            if (!st.contains(word)) {
                st.put(word, 1);
            } else {
                st.put(word, st.get(word) + 1);
            }
        }

        String max = "";
        st.put(max, 0);
        for (String word : st.keys()) {
            if (st.get(word) > st.get(max)) {
                max = word;
            }
        }
        StdOut.println(max + " " + st.get(max));
    }
}
