package $2_Sorting;

/**
 * Created by hailstone01 on 1/29/16.
 */
public class Q1 {
    private int[] id;
    private int[] groupSize;
    private int N;

    public Q1(int N) {
        this.N = N;
        id = new int[N];
        groupSize = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            groupSize[i] = 1;
        }
    }

    public void union(int p, int q) {
        if (isConnected(p, q)) {
            System.out.println("already connected");
            return;
        }

        if (groupSize[find(p)] > groupSize[find(q)]) {
            id[find(q)] = find(p);
            groupSize[find(p)] = groupSize[find(p)] + groupSize[find(q)];
        } else {
            id[find(p)] = find(q);
            groupSize[find(q)] = groupSize[find(p)] + groupSize[find(q)];
        }
        N--;
        if (N == 1) {
            System.out.println("all connected");
        }
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

    public static void main(String[] args) {
        Q1 q1 = new Q1(3);
        q1.union(0, 1);
        q1.union(0, 2);
//        q1.union(2, 1);
    }
}
