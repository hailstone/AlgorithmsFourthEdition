package interview_questions;

/**
 * Created by hailstone01 on 2/5/16.
 */
public class LoopLink {
    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node init() {
        Node node0 = new Node(3);
        Node node1 = new Node(32);
        Node node2 = new Node(7);
        Node node3 = new Node(23);
        Node node4 = new Node(9);
        Node node5 = new Node(56);
        Node node6 = new Node(31);
        Node node7 = new Node(73);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node4;

        return node0;
    }

    public static boolean hasLoop(Node x) {
        Node y = x.next;
        while (true) {
            if (x == null || y == null || y.next == null) {
                return false;
            }

            if (x == y) {
                return true;
            }
            x = x.next;
            y = y.next.next;
        }
    }

    public static int getLoopLen(Node x) {
        Node y = x.next;
        int len = 1;
        while (true) {
            if (x == y) {
                Node temp = x;
                x = x.next;
                while (temp != x) {
                    len++;
                    x = x.next;
                }
                return len;
            }
            x = x.next;
            y = y.next.next;
        }
    }

    public static void main(String[] args) {
        Node root = init();
        System.out.println(hasLoop(root));
        System.out.println(getLoopLen(root));
    }
}
