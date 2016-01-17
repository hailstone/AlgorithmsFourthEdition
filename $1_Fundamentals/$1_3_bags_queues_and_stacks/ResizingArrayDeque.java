package $1_fundamentals.$1_3_bags_queues_and_stacks;

/**
 * Created by hailstone01 on 1/14/16.
 */
public class ResizingArrayDeque<T> {
    private T[] arr;
    private int first;
    private int last;
    private int size;

    public ResizingArrayDeque() {
        arr = (T[]) new Object[3];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return this.size;
    }

    public void pushLeft(T item) {
        if (size != 0) {
            first -= 1;
        }
        if (first < 0) {
            first += arr.length;
        }
        arr[first] = item;
        size++;
        if (size >= arr.length) {
            resize(2 * arr.length);
        }
    }

    public void pushRight(T item) {
        if (size != 0) {
            last += 1;
        }
        if (last > arr.length) {
            last -= arr.length;
        }
        arr[last] = item;
        size++;
        if (size >= arr.length) {
            resize(2 * arr.length);
        }
    }

    public T popLeft() {
        T result = arr[first];
        size--;
        arr[first] = null;
        first = (first + 1) % arr.length;
        return result;
    }

    public T popRight() {
        T result = arr[last];
        size--;
        arr[last] = null;
        last = (last - 1 + arr.length) % arr.length;
        return result;
    }

    public void resize(int length) {
        T[] newArr = (T[]) new Object[length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[first % arr.length];
            first++;
        }
        arr = newArr;
        first = 0;
        last = size - 1;
    }

    public void traverse() {
        int current = first;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[current % arr.length] + "\t");
            current++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ResizingArrayDeque<String> resizingArrayDeque = new ResizingArrayDeque<String>();
        resizingArrayDeque.pushLeft("aa");
        resizingArrayDeque.pushLeft("bb");
        resizingArrayDeque.pushRight("cc");
        resizingArrayDeque.pushRight("dd");
        resizingArrayDeque.traverse();

        resizingArrayDeque.popRight();
        resizingArrayDeque.traverse();
    }
}
