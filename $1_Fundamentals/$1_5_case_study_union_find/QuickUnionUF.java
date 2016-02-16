package $1_fundamentals.$1_5_case_study_union_find;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by hailstone01 on 1/20/16.
 */
public class QuickUnionUF {
    private int[] parent;
    private int count;
    private int[] size;

    public QuickUnionUF(int N) {
        count = N;
        parent = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int p) {
        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
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
            parent[pRoot] = qRoot;
            size[qRoot] = pSize + qSize;
        } else {
            parent[qRoot] = pRoot;
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
        QuickUnionUF quickUnionUf = new QuickUnionUF(N);
        while (scanner.hasNext()) {
            quickUnionUf.union(scanner.nextInt(), scanner.nextInt());
        }

        System.out.println(quickUnionUf.getCount());
    }
}
