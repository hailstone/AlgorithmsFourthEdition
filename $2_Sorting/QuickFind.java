package $2_Sorting;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/29/16.
 */
public class QuickFind {
    private int[] id;
    private int size;

    public QuickFind(int N) {
        this.size = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {
        if (isConnected(p, q)) {
            System.out.println("already connected, pass.");
            return;
        }

        int pID = find(p);
        int qID = find(q);

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) {
                id[i] = qID;
            }
        }
        size--;
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        return id[p];
    }

    public void show() {
        for (int item : id) {
            System.out.printf("%d\t", item);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickFind quickFind = new QuickFind(10);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            String[] arg = s.split("-");
            quickFind.union(Integer.valueOf(arg[0]), Integer.valueOf(arg[1]));
        }
        quickFind.show();
    }
}
