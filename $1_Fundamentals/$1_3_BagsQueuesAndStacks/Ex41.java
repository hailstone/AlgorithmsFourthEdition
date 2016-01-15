package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

/**
 * Created by hailstone01 on 1/15/16.
 * copy a queue
 */
public class Ex41<T> {
    Node<T> first;
    Node<T> last;

    public void addToLast(T t) {
        Node<T> newNode = new Node<T>(t);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public T getFirstItem() throws Exception {
        if (first == null) {
            throw new Exception("list is empty");
        }

        if (first == last) {
            T result = first.getItem();
            first = null;
            last = null;
            return result;
        } else {
            Node<T> temp = first;
            first = first.next;
            temp.next = null;
            return temp.getItem();
        }
    }

    public Node<T> copy(Node<T> first) {
        Node<T> newFirst = null;

        for (Node<T> current = first, newCurrent = null; current != null; current = current.next) {
            if (current == first) {
                newFirst = new Node<T>(current.getItem());
                newCurrent = newFirst;
            } else {
                newCurrent.next = new Node<T>(current.getItem());
                newCurrent = newCurrent.next;
            }
        }
        return newFirst;
    }

    public void traverse() {
        for (Node<T> current = first; current != null; current = current.next) {
            System.out.print(current.getItem() + "\t");
        }
        System.out.println();
    }

    public void traverse(Node<T> first) {
        for (Node<T> current = first; current != null; current = current.next) {
            System.out.print(current.getClass() + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Ex41<String> ex = new Ex41<String>();
        ex.addToLast("aa");
        ex.addToLast("bb");
        ex.addToLast("cc");
        ex.addToLast("dd");

        ex.traverse();
        Node<String> newFirst = ex.copy(ex.first);
        System.out.println(ex.first.hashCode());
        System.out.println(newFirst.hashCode());
        ex.getFirstItem();
        ex.traverse();

        for (Node<String> current = newFirst; current != null; current = current.next) {
            System.out.print(current.getItem() + "\t");
        }
    }
}
