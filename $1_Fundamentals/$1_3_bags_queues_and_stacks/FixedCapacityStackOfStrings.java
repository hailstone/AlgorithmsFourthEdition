package $1_fundamentals.$1_3_bags_queues_and_stacks;

/**
 * Created by hailstone01 on 1/11/16.
 */
public class FixedCapacityStackOfStrings<T> {
    private int capacity;
    private int size = 0;
    T[] arr;

    public FixedCapacityStackOfStrings(int N) {
        this.capacity = N;
        arr = (T[]) new Object[N];
    }

    public void push(T s) throws Exception {
        if (size >= capacity) {
            throw new Exception("stack full");
        }

        arr[size] = s;
        size++;
    }

    public T pop() throws Exception {
        if (size <= 0) {
            throw new Exception("stack empty");
        }

        size--;
        return arr[size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return this.size;
    }

    public static void main(String[] args) throws Exception {
        FixedCapacityStackOfStrings<String> st = new FixedCapacityStackOfStrings<String>(3);
        st.push("aa");
        st.push("bb");
        st.push("cc");
    }
}
