package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

/**
 * Created by hailstone01 on 1/11/16.
 */

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/11/16.
 */
public class Ex2_Stack<T> {
    private Node first;
    private int N;

    private class Node {
        T item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(T item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = first;
        first = newNode;
        N++;
    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("stack is empty, can't pop anymore");
        }
        T item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public void traverse() {
        for (Node temp = first; temp != null; temp = temp.next) {
            System.out.println(temp.item + "\t");
        }
        System.out.println();
    }
}

class Ex2_StackTestDrive {
    public static void main(String[] args) throws Exception {
        Ex2_Stack<String> s = new Ex2_Stack<String>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String item = scanner.next();

            if ("-".equals(item)) {
                s.pop();
            } else {
                s.push(item);
            }
        }

        s.traverse();
    }
}

