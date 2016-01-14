package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by hailstone01 on 1/14/16.
 */
public class RandomQueue<Item> implements Iterable<Item> {
    private Item[] arr;
    private int size;

    public RandomQueue() {
        arr = (Item[]) new Object[10];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(Item item) {
        arr[size] = item;
        size++;
    }

    public Item dequeue() throws Exception {
        if (size == 0) {
            throw new Exception("list empty");
        }

        return arr[--size];
    }

    public Item sample() throws Exception {
        if (size == 0) {
            throw new Exception("list empty");
        }

        int random = (int) (Math.random() * size);
        size--;
        Item result = arr[random];
        arr[random] = arr[size];
        return result;
    }


    @Override
    public Iterator<Item> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Item> {
        ArrayList<Item> arrayList = new ArrayList<Item>();

        public MyIterator() {
            for (int i = 0; i < size; i++) {
                arrayList.add(arr[i]);
            }
        }

        @Override
        public boolean hasNext() {
            return !arrayList.isEmpty();
        }

        @Override
        public Item next() {
            int random = (int) (Math.random() * arrayList.size());
            return arrayList.remove(random);
        }
    }


    public static void main(String[] args) {
        RandomQueue<String> randomQueue = new RandomQueue<String>();
        randomQueue.enqueue("aa");
        randomQueue.enqueue("bb");
        randomQueue.enqueue("cc");

        for (String s : randomQueue) {
            System.out.println(s);
        }
    }
}
