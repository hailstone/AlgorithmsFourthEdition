package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

/**
 * Created by hailstone01 on 1/13/16.
 */
public class Ex29_Queue<T> {
    private Node<T> last = null;

    public Node<T> getLast() {
        return this.last;
    }

    public void traverse() {
        Node<T> current = last.next;
        if (current == null) {
            return;
        } else {
            while (current != null && current != last) {
                System.out.println(current.getItem());
                current = current.next;
            }
            System.out.println(current.getItem());
        }
    }

    public void add(T item) {
        if (last == null) {
            last = new Node<T>(item);
            last.next = last;
        } else {
            Node<T> newNode = new Node<T>(item);
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public static void main(String[] args) {
        Ex29_Queue<String> q = new Ex29_Queue<String>();
        q.add("aa");
        q.add("bb");
        q.add("cc");

        q.traverse();
    }
}
