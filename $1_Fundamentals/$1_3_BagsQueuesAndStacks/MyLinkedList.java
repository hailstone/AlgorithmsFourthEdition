package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

/**
 * Created by hailstone01 on 1/13/16.
 */
public class MyLinkedList<T> {
    Node first;

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

    public void insertAfter(Node<String> a, Node<String> b) {
        if (a == null || b == null) {
            return;
        }

        first = a;
        Node<String> current = a;
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

        Node<String> current = first;
        while (current != null && current.next != null) {
            if (current.next.item.equals(key)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void traverse() {
        Node<T> current = first;
        while (current != null) {
            System.out.print(current.item + "\t");
            current = current.next;
        }
        System.out.println();
    }
}
