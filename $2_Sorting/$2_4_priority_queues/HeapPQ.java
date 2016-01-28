package $2_Sorting.$2_4_priority_queues;

/**
 * Created by hailstone01 on 1/28/16.
 */
public class HeapPQ {
    int[] pq;
    int size;

    public HeapPQ(int length) {
        pq = new int[length + 1];
    }

    public void push(int n) {
        if (size < pq.length - 1) {
            swim(n);
        } else {
            if (n < getMax()) {
                sink(n);
            }
        }
    }

    private void sink(int n) {
        pq[1] = n;

        int p = 1;
        while (2 * p < size) {
            int j = 2 * p;

            if (pq[2 * p] < pq[2 * p + 1]) {
                j++;
            }

            if (pq[j] > pq[p]) {
                exch(j, p);
            } else {
                break;
            }

            p = j;
        }
    }

    private void swim(int n) {
        pq[++size] = n;
        for (int i = size; i > 1 && pq[size / 2] < pq[size]; i /= 2) {
            exch(size, size / 2);
        }
    }

    private void exch(int i, int j) {
        int temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }

    public int getMax() {
        return pq[1];
    }

    public int pop() throws Exception {
        if (size <= 0) {
            throw new Exception("stack empty");
        }

        return -1;
    }

    public void show() {
        for (int i = 1; i < pq.length; i++) {
            System.out.print(pq[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HeapPQ heapPQ = new HeapPQ(5);
        heapPQ.push(2);
        heapPQ.push(8);
        heapPQ.push(3);
        heapPQ.push(5);
        heapPQ.push(7);
        heapPQ.push(1);
        heapPQ.push(9);

        heapPQ.show();
    }
}
