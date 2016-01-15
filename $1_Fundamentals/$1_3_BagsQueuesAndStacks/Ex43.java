package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

import java.io.File;

/**
 * Created by hailstone01 on 1/15/16.
 */
public class Ex43 {
    public static void listFiles(String s, int depth) {
        File file = new File(s);
        for (File temp : file.listFiles()) {
            if (temp.isFile()) {
                for (int i = 0; i < depth; i++) {
                    System.out.print("\t");
                }
                System.out.println(temp);
            } else {
                listFiles(temp.getAbsolutePath(), depth + 1);
            }
        }
    }

    public static void main(String[] args) {
        listFiles("/Users/hailstone01/code/AlgorithmsFourthEdition", 0);
    }
}
