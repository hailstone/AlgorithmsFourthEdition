package $1_fundamentals.$1_5_case_study_union_find;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/19/16.
 */
public class QuickFindUF {
    private int[] id;
    private int count;

    public QuickFindUF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        return id[p];
    }

    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);

        if (pID == qID) {
            return;
        }
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) {
                id[i] = qID;
            }
        }
        count--;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("algs4-data/mediumUF.txt"));
        int N = scanner.nextInt();
        QuickFindUF quickFindUf = new QuickFindUF(N);
        while (scanner.hasNext()) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            if (quickFindUf.connected(p, q)) {
                System.out.println(p + " and " + q + " already connected");
                continue;
            }
            quickFindUf.union(p, q);
//            System.out.println(p + " " + q);
        }
    }
}
