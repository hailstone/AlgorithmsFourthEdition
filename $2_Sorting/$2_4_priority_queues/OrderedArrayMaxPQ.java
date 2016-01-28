package $2_Sorting.$2_4_priority_queues;

/**
 * Created by hailstone01 on 1/28/16.
 */
public class OrderedArrayMaxPQ {
    int[] pq;
    int size;

    public OrderedArrayMaxPQ(int length) {
        pq = new int[length];
    }

    public void push(int n) throws Exception {
        if (size < pq.length) {
            insert(n);
        } else {
            if (getMax() > n) {
                pop();
                insert(n);
            }
        }
    }

    private void insert(int n) {
        pq[size++] = n;
        for (int i = size - 1; i > 0 && pq[i - 1] > pq[i]; i--) {
            pq[i] = pq[i] + pq[i - 1];
            pq[i - 1] = pq[i] - pq[i - 1];
            pq[i] = pq[i] - pq[i - 1];
        }
    }

    public int getMax() throws Exception {
        if (size <= 0) {
            throw new Exception("stack is empty now");
        }

        return pq[size - 1];
    }

    public int pop() throws Exception {
        if (size <= 0) {
            throw new Exception("stack is empty now");
        }

        return pq[--size];
    }

    public void show() {
        for (int item : pq) {
            System.out.print(item + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        OrderedArrayMaxPQ orderedArrayMaxPQ = new OrderedArrayMaxPQ(3);
        orderedArrayMaxPQ.push(5);
        orderedArrayMaxPQ.push(1);
        orderedArrayMaxPQ.push(3);
        orderedArrayMaxPQ.push(7);
        orderedArrayMaxPQ.push(2);
        orderedArrayMaxPQ.show();
    }
}
