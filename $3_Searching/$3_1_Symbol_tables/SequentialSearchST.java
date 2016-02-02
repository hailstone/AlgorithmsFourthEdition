package $3_Searching.$3_1_Symbol_tables;

import edu.princeton.cs.algs4.Queue;

/**
 * Created by hailstone01 on 2/1/16.
 */
public class SequentialSearchST<Key, Value> {
    private Node first;

    private class Node {
        Key key;
        Value val;
        Node next;

        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    public Value get(Key key) {
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                return x.val;
            }
        }
        return null;
    }

    public void put(Key key, Value val) {
        for (Node x  = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        }
        first = new Node(key, val, first);
    }

    public int size() {
        int count = 0;
        for (Node x = first; x != null; x = x.next) {
            count++;
        }
        return count;
    }

    public void delete(Key key) {
        if (first == null || key == null) {
            return;
        }

        if (key.equals(first.key)) {
            first = first.next;
        }

        for (Node x = first; x.next != null; x = x.next) {
            if (key.equals(x.next.key)) {
                x.next = x.next.next;
                return;
            }
        }
    }

    public Iterable<Key> keys() {
        Queue<Key> queue = new Queue<Key>();
        for (Node x = first; x != null; x = x.next) {
            queue.enqueue(x.key);
        }
        return queue;
    }

    public boolean contains(Key key) {
        if (key == null) {
            throw new NullPointerException("argument to contains() is null");
        }
        return get(key) != null;
    }

    public static void main(String[] args) {

    }
}
