package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

import java.util.Iterator;

/**
 * Created by hailstone01 on 1/11/16.
 */
public class Bag<T> implements Iterable<T> {
    private Node first;

    private class Node {
        T item;
        Node next;
    }

    public void add(T item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = first;
        first = newNode;
    }

    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {

        }

        public T next() {
            T item = current.item;
            current = current.next;
            return item;
        }
    }
}

class BagTestDrive {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<String>();

        bag.add("aa");
        bag.add("bb");
        bag.add("cc");

        for (Object s : bag) {
            System.out.println(s);
        }
    }
}
