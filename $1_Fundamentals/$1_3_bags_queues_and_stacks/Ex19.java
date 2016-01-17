package $1_fundamentals.$1_3_bags_queues_and_stacks;

/**
 * Created by hailstone01 on 1/13/16.
 */
public class Ex19 {
    public static Node removeLast(Node first) throws Exception {
        if (first == null) {
            throw new Exception("link is empty");
        }

        if (first.next == null) {
            return null;
        }

        Node current = first;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;

        return first;
    }

    public static void traverse(Node first) {
        Node current = first;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    public static void main(String[] args) throws Exception {
        Node<String> first = new Node<String>("aa");
        first.next = new Node<String>("bb");
        first.next.next = new Node<String>("cc");

        traverse(first);
        System.out.println();

        first = removeLast(first);
        traverse(first);
        System.out.println();

        first = removeLast(first);
        traverse(first);
        System.out.println();

        first = removeLast(first);
        traverse(first);
        System.out.println();
    }
}
