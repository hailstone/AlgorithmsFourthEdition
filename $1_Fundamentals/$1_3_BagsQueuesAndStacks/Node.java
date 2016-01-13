package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

/**
 * Created by hailstone01 on 1/13/16.
 */
public class Node<T> {
    T item;
    Node next;

    public Node() {

    }

    public Node(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "item is: " + item;
    }

}
