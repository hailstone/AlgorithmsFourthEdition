package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

/**
 * Created by hailstone01 on 1/15/16.
 */
public class RingBuffer<Item> {
    Item[] arr;
    int first;
    int last;
    int size;

    public RingBuffer() {
        arr = (Item[]) new Object[5];
    }

    public void enqueue(Item item) throws Exception {
        if (size >= arr.length) {
            throw new Exception("queue is full now");
        }

        if (size == 0) {
            arr[last] = item;
        } else {
            last++;
            arr[last % arr.length] = item;
        }
        size++;
    }

    public Item dequeue() throws Exception {
        if (size == 0) {
            throw new Exception("queue is empty now");
        }

        Item result = arr[last];
        if (size == 1) {
            first = 0;
            last = 0;
        } else {
            last -= 1;
            last = (last + arr.length) % arr.length;
        }
        size--;
        return result;
    }

    public void traverse() {
        int current = first;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[current % arr.length] + "\t");
            current += 1;
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        RingBuffer<String> ringBuffer = new RingBuffer<String>();

        ringBuffer.enqueue("aa");
        ringBuffer.enqueue("bb");
        ringBuffer.enqueue("cc");
        ringBuffer.enqueue("dd");
        ringBuffer.traverse();

        ringBuffer.dequeue();
        ringBuffer.traverse();
    }
}
