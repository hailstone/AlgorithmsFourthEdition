package $1_fundamentals.$1_3_bags_queues_and_stacks;

/**
 * Created by hailstone01 on 1/15/16.
 */
public class Ex42<T> {
    Node<T> first;
    Node<T> last;

    public void push(T t) {
        Node<T> newNode = new Node<T>(t);
        if (last == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public T pop() throws Exception {
        if (last == null) {
            throw new Exception("list is empty");
        }

        T result = last.getItem();
        if (first == last) {
            first = null;
            last = null;
        } else {
            Node<T> current;
            for (current = first; current.next != last; current = current.next) {
            }
                current.next = null;
                last = current;
        }
        return result;
    }

    public void traverse() {
        for (Node<T> current = first; current != null; current = current.next) {
            System.out.print(current.getItem() + "\t");
        }
        System.out.println();
    }

    public static <T> void traverse(Node<T> n) {
        for (Node<T> current = n; current != null; current = current.next) {
            System.out.print(current.getItem() + "\t");
        }
        System.out.println();
    }

    public static <T> Node<T> copy(Node<T> first) {
        Node<T> newFirst = null;

        if (first == null) {
            return null;
        }

        for (Node<T> current = first, newCurrent = newFirst; current != null; current = current.next) {
            Node<T> newNode = new Node<T>(current.getItem());
            if (newCurrent == null) {
                newCurrent = newNode;
                newFirst = newNode;
            } else {
                newCurrent.next = newNode;
                newCurrent = newCurrent.next;
            }
        }
        return newFirst;
    }


    public static void main(String[] args) throws Exception {
        Ex42<String> ex = new Ex42<String>();
        ex.push("aa");
        ex.push("bb");
        ex.push("cc");
        ex.traverse();

        Node<String> newFirst = copy(ex.first);
        ex.pop();
        traverse(ex.first);
        traverse(newFirst);
    }
}
