package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

/**
 * Created by hailstone01 on 1/13/16.
 */
public class MyLinkedList<T> {
    private Node<T> first;

    public Node<T> getFirst() {
        return this.first;
    }

    public void add(T s) {
        if (first == null) {
            first = new Node<T>(s);
        } else {
            Node current = first;

            while (current.next != null) {
                current = current.next;
            }

            current.next = new Node<T>(s);
        }
    }

    public void addNode(Node<T> node) {
        if (first == null) {
            first = node;
        } else {
            Node current = first;

            while (current.next != null) {
                current = current.next;
            }

            current.next = node;
        }
    }

    public boolean find(T key) {
        Node<T> current = first;
        while (current != null) {
            if (current.item.equals(key)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public void removeAfter(Node<T> node) {
        if (node == null || node.next == null) {
            return;
        }

        node.next = node.next.next;
    }

    public void insertAfter(Node<T> a, Node<T> b) {
        if (a == null || b == null) {
            return;
        }

        first = a;
        Node<String> current = (Node<String>) a;
        while (current.next != null) {
            current = current.next;
        }

        current.next = b;
    }

    public void remove(String key) {
        if (first == null) {
            return;
        }

        while (first != null && first.item.equals(key)) {
            first = first.next;
        }

        Node<String> current = (Node<String>) first;
        while (current != null && current.next != null) {
            if (current.next.item.equals(key)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public T removeLast() throws Exception {
        if (first == null) {
            throw new Exception("linked list is empty");
        }

        T last;

        if (first.next == null) {
            last = first.item;
            first = null;
        } else {
            Node<T> current = first;
            while (current.next.next != null) {
                current = current.next;
            }

            last = (T) current.next.item;
            current.next = null;
        }
        return last;
    }

    public void insertFirst(Node<T> node) {
        if (first == null) {
            first = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public void insertFirst(T t) {
        Node<T> node = new Node<T>(t);
        insertFirst(node);
    }

    public void traverse() {
        Node<T> current = first;
        while (current != null) {
            System.out.print(current.item + "\t");
            current = current.next;
        }
        System.out.println();
    }

    public int getSize() {
        if (first == null) {
            return 0;
        }

        int size = 0;
        Node<T> current = first;
        while (current != null) {
            current = current.next;
            size++;
        }

        return size;
    }

    public static void main(String[] args) throws Exception {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.add("aa");
        myLinkedList.add("bb");
        myLinkedList.add("cc");
        myLinkedList.traverse();

        System.out.println(myLinkedList.removeLast());
        myLinkedList.traverse();

        myLinkedList.insertFirst("ff");
        myLinkedList.traverse();
    }
}
