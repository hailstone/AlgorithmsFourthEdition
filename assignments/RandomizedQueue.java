package assignments;

import edu.princeton.cs.algs4.Queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by hailstone01 on 2/5/16.
 */
public class RandomizedQueue<Item> implements Iterable<Item> {
    private Item[] arr;
    private int last;
    private int N;

    public RandomizedQueue() {
        this(3);
    }

    private RandomizedQueue(int initialLen) {
        arr = (Item[]) new Object[initialLen];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item) {
        if (item == null) {
            throw new NullPointerException();
        }

        if (N == arr.length) {
            resize(arr.length * 2);
        }
        arr[last++] = item;
        N++;
    }

    public Item dequeue() {
        if (N <= arr.length / 4) {
            resize(arr.length / 2);
        }
        shuffle();
        return arr[--N];
    }

    private void resize(int newLen) {
        Item[] temp = Arrays.copyOf(arr, arr.length);
        arr = temp;
    }

    public Item sample() {
        return arr[(int) (Math.random() * N)];
    }

    private void shuffle() {
        for (int i = 1; i < N; i++) {
            int j = (int) (Math.random() * (i + 1));
            exch(i, j);
        }
    }

    private void exch(int i, int j) {
        Item temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Override
    public Iterator<Item> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Item> {
        Queue<Item> queue = new Queue<Item>();

        public MyIterator() {
            shuffle();
            for (int i = 0; i < N; i++) {
                queue.enqueue(arr[i]);
            }
        }

        @Override
        public boolean hasNext() {
            return queue.isEmpty();
        }

        @Override
        public Item next() {
            if (queue.isEmpty()) {
                throw new NoSuchElementException();
            }
            return queue.dequeue();
        }

        public void remove(Item item) {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {

    }
}
