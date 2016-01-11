package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

/**
 * Created by hailstone01 on 1/11/16.
 */
public class Queue<T> {
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
        Queue<String> queue = new Queue<String>();

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
