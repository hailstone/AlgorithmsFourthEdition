package $1_fundamentals.$1_3_bags_queues_and_stacks;

/**
 * Created by hailstone01 on 1/15/16.
 */
public class MoveToFront<T> {
    Node<T> first;
    int size;

    public void prepend(T t) {
        Node<T> newNode = new Node<T>(t);
        if (first == null) {
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public boolean has(T t) {
        if (first == null) {
            return false;
        }

        Node<T> current = first;
        while (current != null) {
            if (current.getItem().equals(t)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public T delete(T t) throws Exception {
        if (first == null) {
            throw new Exception("list is empty");
        }

        if (first.getItem().equals(t)) {
            T result = first.getItem();
            Node<T> temp = first.next;
            first.next = null;
            first = temp;
            size--;
            return result;
        } else {
            Node<T> current = first;
            while (current.next != null) {
                if (current.next.getItem().equals(t)) {
                    Node<T> temp = current.next;
                    current.next = current.next.next;
                    temp.next = null;
                    size--;
                    return temp.getItem();
                }
                current = current.next;
            }

            throw new Exception("can't find the value in the list");
        }
    }

    public void add(T t) throws Exception {
        if (has(t)) {
            delete(t);
        }

        prepend(t);
        traverse();
    }

    public void traverse() {
        for (Node<T> current = first; current != null; current = current.next) {
            System.out.print(current.getItem() + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        MoveToFront<String> moveToFront = new MoveToFront<String>();

        moveToFront.add("aa");
        moveToFront.add("bb");
        moveToFront.add("cc");
        moveToFront.add("bb");

    }
}
