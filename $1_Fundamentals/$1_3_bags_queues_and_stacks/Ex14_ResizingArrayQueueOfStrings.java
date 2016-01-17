package $1_fundamentals.$1_3_bags_queues_and_stacks;

/**
 * Created by hailstone01 on 1/12/16.
 */
public class Ex14_ResizingArrayQueueOfStrings<T> {
    T[] arr = (T[]) new Object[3];
    int first = 0;
    int last = 0;
    int size = 0;

    public void enqueue(T item) throws Exception {

        arr[last] = item;
        size++;
        last = (last + 1) % arr.length;

        if (size == arr.length) {
            resize(2 * arr.length);
        }
    }

    public T dequeue() throws Exception {
        if (size == 0) {
            throw new Exception("queue is empty now");
        }

        T result = arr[first];
        first = (first + 1) % arr.length;
        size--;
        if (size < arr.length / 4) {
            resize(arr.length / 2);
        }
        return result;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void resize(int newSize) throws Exception {
        T[] newArr = (T[]) new Object[newSize];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[(first + i) % arr.length];
        }
        first = 0;
        last = size;
        arr = newArr;
    }

    public static void main(String[] args) throws Exception {
        Ex14_ResizingArrayQueueOfStrings<String> q = new Ex14_ResizingArrayQueueOfStrings<String>();

        q.enqueue("fi");
        q.enqueue("aa");
        q.enqueue("aa");
        q.enqueue("aa");
        q.enqueue("aa");
        q.enqueue("aa");
        q.enqueue("aa");
        q.enqueue("aa");
        q.enqueue("aa");
        q.enqueue("aa");
        q.enqueue("aa");
        q.enqueue("aa");
        q.enqueue("aa");
        q.enqueue("aa");
        q.enqueue("ff");
        System.out.println(q.getSize());
        System.out.println(q.dequeue());
    }
}
