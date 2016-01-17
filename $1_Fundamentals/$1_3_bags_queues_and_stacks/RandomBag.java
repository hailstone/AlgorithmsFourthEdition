package $1_fundamentals.$1_3_bags_queues_and_stacks;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by hailstone01 on 1/14/16.
 */
public class RandomBag<Item> implements Iterable<Item> {
    private ArrayList<Item> arrayList = new ArrayList<Item>();

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    public int size() {
        return arrayList.size();
    }

    public void add(Item item) {
        arrayList.add(item);
    }

    public void print() {
        for (Item item : arrayList) {
            System.out.println(item);
        }
    }


    @Override
    public Iterator<Item> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Item> {
        ArrayList<Item> temp = new ArrayList<Item>(arrayList);

        @Override
        public boolean hasNext() {
            return !temp.isEmpty();
        }

        @Override
        public Item next() {
            int randomIndex = (int) (Math.random() * temp.size());
            return temp.remove(randomIndex);
        }
    }

    public static void main(String[] args) {
        RandomBag<String> randomBag = new RandomBag<String>();
        randomBag.add("aa");
        randomBag.add("bb");
        randomBag.add("cc");
        randomBag.add("dd");

        for (String s : randomBag) {
            System.out.println(s);
        }
    }
}
