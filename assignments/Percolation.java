package assignments;

/**
 * Created by hailstone01 on 1/29/16.
 */
public class Percolation {
    private Site[] sites;
    private int N;
    private int count;

    private class Site {
        private boolean isOpen;
        private int parentID;
        private int groupSize;
    }

    public Percolation(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException();
        }
        this.N = N;
        count = N * N;
        sites = new Site[N * N + 2];
        for (int i = 0; i < sites.length; i++) {
            sites[i] = new Site();
            sites[i].isOpen = false;
            sites[i].parentID = i;
            sites[i].groupSize = 1;

            if (i >= N * N) {
                sites[i].isOpen = true;
            }
        }
    }

    public void open(int i, int j) {
        int index = convert(i, j);
        if (sites[index].isOpen) {
//            System.out.println("already isOpen, return");
            return;
        }

        sites[index].isOpen = true;

        if (i > 1 && sites[convert(i - 1, j)].isOpen) {
            connect(index, convert(i - 1, j));
        }

        if (i + 1 <= N && sites[convert(i + 1, j)].isOpen) {
            connect(index, convert(i + 1, j));
        }

        if (j > 1 && sites[convert(i, j - 1)].isOpen) {
            connect(index, convert(i, j - 1));
        }

        if (j + 1 <= N && sites[convert(i, j + 1)].isOpen) {
            connect(index, convert(i, j + 1));
        }

        if (i == 1) {
            connect(index, N * N);
        }

        if (i == N) {
            connect(index, N * N + 1);
        }
    }

    public boolean isOpen(int i, int j) {
        int index = convert(i, j);
        return sites[index].isOpen;
    }

    public boolean isFull(int i, int j) {
        int index = convert(i, j);
        return findRootID(index) == findRootID(N * N);
    }

    private void connect(int p, int q) {
        int pRootID = findRootID(p);
        int qRootID = findRootID(q);

        if (sites[pRootID].groupSize > sites[qRootID].groupSize) {
            sites[qRootID].parentID = pRootID;
            sites[pRootID].groupSize = sites[pRootID].groupSize + sites[qRootID].groupSize;
        } else {
            sites[pRootID].parentID = qRootID;
            sites[qRootID].groupSize = sites[pRootID].groupSize + sites[qRootID].groupSize;
        }
        count--;
    }

    private int findRootID(int p) {
        while (sites[p].parentID != p) {
            p = sites[p].parentID;
        }

        return p;
    }

    private int convert(int i, int j) {
        if (i > N || j > N) {
            throw new IndexOutOfBoundsException();
        }
        return (i - 1) * N + (j - 1);
    }

    public boolean percolates() {
        return findRootID(N * N) == findRootID(N * N + 1);
    }

    private void show() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int index = i * N + j;
                if (sites[index].isOpen) {
                    System.out.print("O\t");
                } else {
                    System.out.print("X\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        int N = 5;
//        Percolation percolation = new Percolation(N);
//
//        Scanner scanner = new Scanner(System.in);
//
//        int count = 0;
//
//        while (true) {
//            if (percolation.percolates()) {
//                System.out.println("percolate now, the count is: " + count);
//                percolation.show();
//                break;
//            }
//            int x = scanner.nextInt();
//            int y = scanner.nextInt();
//            System.out.println("Open, x is: " + x + " y is: " + y);
//            percolation.open(x, y);
//            System.out.println("is it full? " + percolation.isFull(3, 3));
//            percolation.show();
//            count++;
//        }
//
//        System.out.println("over");
    }
}
