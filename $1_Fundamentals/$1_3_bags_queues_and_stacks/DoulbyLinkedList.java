package $1_fundamentals.$1_3_bags_queues_and_stacks;

/**
 * Created by hailstone01 on 1/14/16.
 */
public class DoulbyLinkedList<T> {
    DoubleNode<T> first = null;
    DoubleNode<T> last = null;
    int N = 0;

    public void prepend(T t) {
        DoubleNode<T> newNode = new DoubleNode<T>(t);

        if (first == null && last == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }
        N++;
    }

    public void append(T t) {
        DoubleNode<T> newNode = new DoubleNode<T>(t);

        if (first == null && last == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        }
        N++;
    }

    public T removeFirst() throws Exception {
        if (first == null) {
            throw new Exception("list is already empty");
        }

        T result = first.item;
        first = first.next;
        if (first != null) {
            first.prev = null;
        }
        N--;

        return result;
    }

    public T removeLast() throws Exception {
        if (last == null) {
            throw new Exception("list is already empty");
        }

        T result = last.item;
        last = last.prev;
        if (last != null) {
            last.next = null;
        }
        N--;

        return result;
    }

    public void insertBefore(T newItem, T key) {
        if (first == null) {
            return;
        }

        DoubleNode<T> newNode = new DoubleNode<>(newItem);

        DoubleNode<T> current = first;
        while (!current.item.equals(key)) {
            current = current.next;
            if (current == null) {
                return;
            }
        }

        if (current.prev == null) {
            current.prev = newNode;
            newNode.next = current;
            first = newNode;
        } else {
            DoubleNode<T> previous = current.prev;
            previous.next = newNode;
            newNode.prev = previous;

            current.prev = newNode;
            newNode.next = current;
        }
        N++;
    }

    public void insertAfter(T newItem, T key) {
        if (first == null) {
            return;
        }

        DoubleNode<T> newNode = new DoubleNode<T>(newItem);

        DoubleNode<T> current = first;
        while (!current.item.equals(key)) {
            current = current.next;
            if (current == null) {
                return;
            }
        }

        if (current.next == null) {
            current.next = newNode;
            newNode.prev = current;
            last = newNode;
        } else {
            DoubleNode<T> nextNode = current.next;
            current.next = newNode;
            newNode.prev = current;

            newNode.next = nextNode;
            nextNode.prev = newNode;
        }
        N++;
    }

    public boolean remove(T t) throws Exception {
        if (first == null) {
            return false;
        }

        DoubleNode<T> current = first;
        while (current != null) {
            if (current.item.equals(t)) {
                if (current == first) {
                    removeFirst();
                } else if (current == last) {
                    removeLast();
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    N--;
                }
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public void traverse() {
        DoubleNode<T> current = first;
        for (int i = 0; i < N; i++) {
            System.out.print(current.item + "\t");
            current = current.next;
        }
        System.out.println();
    }

    private class DoubleNode<T> {
        private T item;
        DoubleNode<T> prev;
        DoubleNode<T> next;

        public DoubleNode(T t) {
            this.item = t;
        }

        public T getItem() {
            return item;
        }

        @Override
        public String toString() {
            return "DoulbeNode{" +
                    "item=" + item +
                    '}';
        }
    }

    public static void main(String[] args) throws Exception {
        DoulbyLinkedList<String> doulbyLinkedList = new DoulbyLinkedList<String>();
        doulbyLinkedList.append("aa");
        doulbyLinkedList.append("bb");
        doulbyLinkedList.append("cc");

        doulbyLinkedList.traverse();

        doulbyLinkedList.remove("bb");
        doulbyLinkedList.traverse();

    }
}
