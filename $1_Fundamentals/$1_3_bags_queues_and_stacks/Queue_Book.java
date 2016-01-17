package $1_fundamentals.$1_3_bags_queues_and_stacks;

/**
 * Created by hailstone01 on 1/11/16.
 */
public class Queue_Book<T> {
    Node first = null;
    Node last = null;
    int N = 0;

    private class Node {
        T item;
        Node next;
    }

    public void enqueue(T item) {
        Node newNode = new Node();
        newNode.item = item;
        if (last != null) {
            last.next = newNode;
            last = newNode;
        } else {
            last = newNode;
            first = newNode;
        }
        N++;
    }

    public T dequeue() throws Exception {
        if (N <= 0) {
            throw new Exception("queue is empty now, can't dequeue");
        }

        T result = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        N--;
        return result;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void traverse() {
        for (Node temp = first; temp != null; temp = temp.next) {
            System.out.print(temp.item + "\t");
        }
        System.out.println();
    }
}

class QueueTestDrive {
    public static void main(String[] args) throws Exception {
        Queue_Book<String> queue = new Queue_Book<String>();

        queue.enqueue("aa");
        queue.enqueue("bb");
        queue.enqueue("cc");
        queue.traverse();

        queue.dequeue();
        queue.traverse();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
