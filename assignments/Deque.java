package assignments;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by hailstone01 on 2/5/16.
 */
public class Deque<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int N;


    private class Node {
        private Item data;
        private Node pre;
        private Node next;

        public Node(Item data) {
            this.data = data;
        }
    }

    public Deque() {
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void addFirst(Item item) {
        if (item == null) {
            throw new NullPointerException();
        }

        Node newNode = new Node(item);
        if (N == 0) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first.pre = newNode;
            first = newNode;
        }
        N++;
    }

    public void addLast(Item item) {
        if (item == null) {
            throw new NullPointerException();
        }

        Node newNode = new Node(item);
        if (N == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.pre = last;
        }
        N++;
    }

    public Item removeFirst() {
        if (N == 0) {
            throw new NoSuchElementException();
        }

        Item result = first.data;
        if (N == 1) {
            first = null;
            last = null;
        } else {
            Node temp = first;
            first = first.next;
            temp.next = null;
            first.pre = null;
        }
        N--;
        return result;
    }

    public Item removeLast() {
        if (N == 0) {
            throw new NoSuchElementException();
        }

        Item result = last.data;
        if (N == 1) {
            first = null;
            last = null;
        } else {
            Node temp = last;
            last = last.pre;
            temp.pre = null;
            last.next = null;
        }
        N--;
        return result;
    }

    @Override
    public Iterator<Item> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Item> {
        private Node temp;

        public void remove(Item item) {
            throw new UnsupportedOperationException();
        }

        public MyIterator() {
            temp = first;
        }

        @Override
        public boolean hasNext() {
            return temp != null;
        }

        @Override
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Item result = temp.data;
            temp = temp.next;
            return result;
        }
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<Integer>();
        deque.addFirst(11);
        deque.addFirst(33);
        deque.addFirst(22);

        System.out.println(deque.size());

        for (int i : deque) {
            System.out.println(i);
        }
    }
}
