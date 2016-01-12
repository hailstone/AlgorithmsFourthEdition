package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

/**
 * Created by hailstone01 on 1/12/16.
 */
public class Ex7_Stack<T> {
    Node first = null;

    private class Node {
        T item;
        Node next;
    }

    public void push(T item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = first;
        first = newNode;
    }

    public T pop() throws Exception {
        if (first == null) {
            throw new Exception("stack is empty");
        }
        T result = first.item;
        first = first.next;
        return result;
    }

    public T peek() throws Exception {
        if (first == null) {
            throw new Exception("stack is empty");
        }
        return first.item;
    }

    public void traverse() {
        for (Node temp = first; temp != null; temp = temp.next) {
            System.out.println(temp.item);
        }
    }

    public static void main(String[] args) throws Exception {
        Ex7_Stack<String> stack = new Ex7_Stack<String>();
        stack.push("aa");
        stack.push("bb");
        stack.push("cc");
        stack.traverse();

        stack.pop();
        stack.traverse();

        System.out.println("peek: " + stack.peek());
        stack.traverse();
    }
}
