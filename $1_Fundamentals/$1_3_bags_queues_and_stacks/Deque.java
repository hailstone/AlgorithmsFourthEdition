package $1_fundamentals.$1_3_bags_queues_and_stacks;

/**
 * Created by hailstone01 on 1/14/16.
 */
public class Deque<T> {
    private DoubleLinkNode<T> first;
    private DoubleLinkNode<T> last;
    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return this.size();
    }

    public void pushLeft(T item) {
        DoubleLinkNode<T> newNode = new DoubleLinkNode<>(item);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            first.prev = newNode;
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public void pushRight(T item) {
        DoubleLinkNode<T> newNode = new DoubleLinkNode<>(item);
        if (last == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        size++;
    }

    public T popLeft() throws Exception {
        if (first == null) {
            throw new Exception("list is empty");
        }

        T result = first.getItem();
        size--;
        if (first == last) {
            first = null;
            last = null;
        } else {
            first.next.prev = null;
            first = first.next;
        }

        return result;
    }

    public T popRight() throws Exception {
        if (last == null) {
            throw new Exception("list is empty");
        }

        T result = last.getItem();
        size--;
        if (first == last) {
            first = null;
            last = null;
        } else {
            last.prev.next = null;
            last = last.prev;
        }

        return result;
    }

    public void traverse() {
        DoubleLinkNode<T> current = first;
        while (current != null) {
            System.out.print(current.getItem() + "\t");
            current = current.next;
        }
        System.out.println();
    }

    private class DoubleLinkNode<T> {
        private T item;
        DoubleLinkNode<T> prev;
        DoubleLinkNode<T> next;

        public DoubleLinkNode(T t) {
            this.item = t;
        }

        public T getItem() {
            return item;
        }

        @Override
        public String toString() {
            return "DoubleLinkNode{" +
                    "item=" + item +
                    '}';
        }
    }

    public static void main(String[] args) throws Exception {
        Deque<String> deque = new Deque<String>();
        deque.pushLeft("aa");
        deque.pushLeft("bb");
        deque.pushLeft("cc");
        deque.pushRight("dd");
        deque.pushRight("ee");
        deque.traverse();

        deque.popLeft();
        deque.traverse();

        deque.popRight();
        deque.traverse();
    }
}
