package $2_Sorting.$2_4_priority_queues;

/**
 * Created by hailstone01 on 1/28/16.
 */
public class UnorderedArrayMaxPQ {
    private int[] pq;
    private int size;

    public UnorderedArrayMaxPQ(int capacity) {
        pq = new int[capacity];
    }

    public void push(int n) throws Exception {
        if (size < pq.length) {
          pq[size++] = n;
        } else {
            if (n < getMax()) {
                pop();
                pq[size++] = n;
            }
        }
    }

    public int getMax() throws Exception {
        if (size <= 0) {
            throw new Exception("stack is empty now");
        }

        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (pq[i] > pq[maxIndex]) {
                maxIndex = i;
            }
        }

        return pq[maxIndex];
    }

    public int pop() throws Exception {
        if (size <= 0) {
            throw new Exception("stack is empty now");
        }

        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (pq[i] > pq[maxIndex]) {
                maxIndex = i;
            }
        }

        for (int i = maxIndex + 1; i < size; i++) {
            pq[i - 1] = pq[i];
        }
        size--;

        return pq[maxIndex];
    }

    public void show() {
        for (int item : pq) {
            System.out.print(item + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        UnorderedArrayMaxPQ unorderedArrayMaxPQ = new UnorderedArrayMaxPQ(3);
        unorderedArrayMaxPQ.push(3);
        unorderedArrayMaxPQ.push(7);
        unorderedArrayMaxPQ.push(4);
        unorderedArrayMaxPQ.push(9);
        unorderedArrayMaxPQ.push(11);
        unorderedArrayMaxPQ.push(2);
        unorderedArrayMaxPQ.push(1);
        unorderedArrayMaxPQ.show();
    }
}
