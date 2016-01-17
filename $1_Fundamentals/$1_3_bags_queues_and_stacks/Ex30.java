package $1_fundamentals.$1_3_bags_queues_and_stacks;

import edu.princeton.cs.algs4.Stack;

/**
 * Created by hailstone01 on 1/13/16.
 */
public class Ex30 {
    public static Node<String> reverse2(Node<String> first) {
        Node<String> reversed = null;
        Node<String> temp = null;

        if (first != null) {
            reversed = first;
            first = first.next;
            reversed.next = null;
        }

        while (first != null) {
            temp = first;
            first = first.next;
            temp.next = reversed;
            reversed = temp;
        }

        return reversed;
    }

    public static Node<String> reverse(Node<String> first) throws Exception {
        MyLinkedList<String> temp = new MyLinkedList<String>();
        temp.addNode(first);
        int size = temp.getSize();

        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < size; i++) {
            stack.push(temp.removeLast());
        }

        for (int i = 0; i < size; i++) {
            String s = stack.pop();
            temp.insertFirst(s);
        }

        return temp.getFirst();
    }

    public static void main(String[] args) throws Exception {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.add("aa");
        myLinkedList.add("bb");
        myLinkedList.add("cc");

        Node<String> newNode = new Node<String>();
        newNode = reverse2(myLinkedList.getFirst());
        MyLinkedList<String> reversed = new MyLinkedList<String>();
        reversed.addNode(newNode);
        reversed.traverse();
    }
}
