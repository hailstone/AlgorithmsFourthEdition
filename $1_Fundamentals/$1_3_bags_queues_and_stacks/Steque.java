package $1_fundamentals.$1_3_bags_queues_and_stacks;

/**
 * Created by hailstone01 on 1/14/16.
 */
public class Steque<T> {
    Node<T> first;
    Node<T> last;
    int size;

    public void push(T t) {
        Node<T> newNode = new Node<T>(t);
        if (last == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public T pop() throws Exception {
        if (last == null) {
            throw new Exception("list is empty");
        }

        T result = last.getItem();
        last = first;

        while (last.next != null && last.next.next != null) {
            last = last.next;
        }
        if (last.next == null) {
            first = null;
            last = null;
        } else {
            last.next = null;
        }
        size--;
        return result;
    }

    public void enqueue(T t) {
        Node<T> newNode = new Node<T>(t);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public void traverse() {
        Node<T> current = first;
        for (int i = 0;i < size; i++) {
            System.out.print(current.getItem() + "\t");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Steque<String> st = new Steque<String>();
        st.push("aa");
        st.push("bb");
        st.push("cc");
        st.traverse();

        st.enqueue("ff");
        st.traverse();
    }
}
