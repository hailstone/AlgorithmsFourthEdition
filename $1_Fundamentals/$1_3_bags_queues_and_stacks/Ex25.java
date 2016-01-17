package $1_fundamentals.$1_3_bags_queues_and_stacks;

/**
 * Created by hailstone01 on 1/13/16.
 */
public class Ex25 {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();

        Node<String> a = new Node<String>("aa");
        Node<String> b = new Node<String>("bb");
        a.next = b;

        Node<String> c = new Node<String>("cc");
        Node<String> d = new Node<String>("dd");
        c.next = d;

        myLinkedList.insertAfter(a, c);
        myLinkedList.traverse();
    }
}
