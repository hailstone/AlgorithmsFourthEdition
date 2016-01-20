package $1_fundamentals.$1_5_case_study_union_find;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/20/16.
 */
public class UF2 {
    private int[] id;
    private int count;
    private int[] size;

    public UF2(int N) {
        count = N;
        id = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    public int find(int p) {
        while (true) {
            if (id[p] == p) {
                return p;
            } else {
                return find(id[p]);
            }
        }
    }

    public void union(int p, int q) {
        if (connected(p, q)) {
            System.out.println(p + " and " + q + " already connected");
            return;
        }

        int pRoot = find(p);
        int qRoot = find(q);
        int pSize = size[pRoot];
        int qSize = size[qRoot];

        if (pSize < qSize) {
            id[pRoot] = qRoot;
            size[qRoot] = pSize + qSize;
        } else {
            id[qRoot] = pRoot;
            size[pRoot] = pSize + qSize;
        }

        count--;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int getCount() {
        return this.count;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("algs4-data/largeUF.txt"));
        int N = scanner.nextInt();
        UF2 uf2 = new UF2(N);
        while (scanner.hasNext()) {
            uf2.union(scanner.nextInt(), scanner.nextInt());
        }

        System.out.println(uf2.getCount());
    }
}
