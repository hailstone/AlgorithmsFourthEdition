package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

/**
 * Created by hailstone01 on 1/13/16.
 */
public class Ex20 {
    public static Node delete(Node first, int n) throws Exception {
        Node current = first;
        if (n == 0) {
            if (first == null) {
                throw new Exception("index of out bounds");
            }

            if (first.next == null) {
                return null;
            }

            return first.next;
        }

        for (int i = 0; i + 1 < n && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            throw new Exception("index out of bounds");
        }

        current.next = current.next.next;

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
        first.next =  new Node<String>("bb");
        first.next.next =  new Node<String>("cc");

        traverse(first);
        first = delete(first, 3);
        System.out.println();
        traverse(first);
    }
}
