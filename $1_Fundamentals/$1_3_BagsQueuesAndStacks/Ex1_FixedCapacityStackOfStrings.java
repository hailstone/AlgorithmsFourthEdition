package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

/**
 * Created by hailstone01 on 1/11/16.
 */
public class Ex1_FixedCapacityStackOfStrings<T> {
    private int capacity;
    private int size = 0;
    T[] arr;

    public Ex1_FixedCapacityStackOfStrings(int N) {
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

    public boolean isFull() {
        return size >= capacity;
    }

    public int getSize() {
        return this.size;
    }

    public static void main(String[] args) throws Exception {
        Ex1_FixedCapacityStackOfStrings<String> st = new Ex1_FixedCapacityStackOfStrings<String>(3);
        st.push("aa");
        st.push("bb");
        st.push("cc");
        System.out.println(st.isFull());
    }
}
