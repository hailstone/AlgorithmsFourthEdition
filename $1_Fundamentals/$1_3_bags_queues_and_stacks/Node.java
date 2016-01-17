package $1_fundamentals.$1_3_bags_queues_and_stacks;

/**
 * Created by hailstone01 on 1/13/16.
 */
public class Node<T> {
    private T item;
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

    public T getItem() {
        return item;
    }
}
