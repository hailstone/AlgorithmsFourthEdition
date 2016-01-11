package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/11/16.
 */
public class Stack<T> {
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

class StackTestDrive {
    public static void main(String[] args) throws Exception {
        Stack<String> s = new Stack<String>();
        Scanner scanner = new Scanner(System.in);

        s.push("aa");
        s.push("bb");
        s.push("cc");
        s.traverse();
        s.pop();
        s.traverse();
        s.pop();
        s.pop();
    }
}
