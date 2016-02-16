package $2_Sorting;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/29/16.
 */
public class QuickUnion {
    private int[] id;
    private int size;
    private int[] groupSize;

    public QuickUnion(int N) {
        this.size = N;
        this.id = new int[N];
        this.groupSize = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            groupSize[i] = 1;
        }
    }

    public void union(int p, int q) {
        System.out.println("++++++");
        if (isConnected(p, q)) {
            System.out.println("already connected, pass.");
            return;
        }

        int pID = find(p);
        int qID = find(q);

        if (groupSize[pID] >= groupSize[qID]) {
            id[qID] = pID;
            groupSize[pID] = groupSize[pID] + groupSize[qID];
        } else {
            id[pID] = qID;
            groupSize[qID] = groupSize[pID] + groupSize[qID];
        }
        size--;
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }

    public void show() {
        for (int item : id) {
            System.out.printf("%d\t", item);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickUnion quickUnion = new QuickUnion(10);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            String[] arg = s.split("-");
            System.out.println(arg[0] + " and " + arg[1]);
            quickUnion.union(Integer.valueOf(arg[0]), Integer.valueOf(arg[1]));
        }
        quickUnion.show();
    }
}
