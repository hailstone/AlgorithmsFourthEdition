package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

/**
 * Created by hailstone01 on 1/15/16.
 */
public class Buffer {
    Node<Character> first;
    Node<Character> last;
    Node<Character> cursor;
    int size;

    public Buffer() {
        first = null;
        last = null;
        cursor = null;
    }

    public void insert(char c) {
        Node<Character> newNode = new Node<Character>(c);
        if (cursor == null) {
            cursor = newNode;
            first = newNode;
            last = newNode;
        } else {
            if (cursor == last) {
                append(c);
            } else {
                newNode.next = cursor.next;
                cursor.next = newNode;
                size++;
            }
        }
    }

    public char delete() throws Exception {
        if (cursor == null) {
            throw new Exception("list is empty");
        }

        size--;
        if (size == 1) {
            char result = cursor.getItem();
            first = null;
            last = null;
            cursor = null;
            return result;
        }

        if (first == cursor) {
            Node<Character> temp = first;
            first = first.next;
            temp.next = null;
            cursor = first;
            return temp.getItem();
        } else if (last == cursor) {
            char result = cursor.getItem();
            Node<Character> current;
            for (current = first; current.next != cursor; current = current.next) {
            }
            current.next = null;
            last = current;
            cursor = last;
            return result;
        } else {
            char result = cursor.getItem();
            Node<Character> current;
            for (current = first; current.next != cursor; current = current.next) {
            }
            current.next = cursor.next;
            cursor.next = null;
            cursor = current;
            return result;
        }
    }

    public void prepend(char c) {
        Node<Character> newNode = new Node<Character>(c);
        if (first == null) {
            cursor = newNode;
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public void append(char c) {
        Node<Character> newNode = new Node<Character>(c);
        if (last == null) {
            cursor = newNode;
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void right(int k) {
        if (size <= 1) {
            return;
        }
        k %= size;
        Node<Character> current;
        for (current = first; current != cursor; current = current.next) {
        }

        for (int i = 0; i < k; i++) {
            if (current.next == null) {
                current = first;
            } else {
                current = current.next;
            }
        }
        cursor = current;
    }

    public void left(int k) {
        while (k < 0) {
            k += size;
        }

        right(size - k);
    }

    public void traverse() {
        for (Node<Character> current = first; current != null; current = current.next) {
            System.out.print(current.getItem() + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Buffer buffer = new Buffer();
        buffer.insert('a');
        buffer.insert('b');
        buffer.insert('c');
        buffer.insert('d');
        buffer.traverse();

        buffer.right(333);
        buffer.delete();
        buffer.traverse();
    }
}
