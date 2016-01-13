package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

/**
 * Created by hailstone01 on 1/13/16.
 */
public class Ex24 {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        Node<String> a = new Node<String>("aa");
        Node<String> b = new Node<String>("bb");
        Node<String> c = new Node<String>("cc");
        b.next = c;
        myLinkedList.addNode(b);
        myLinkedList.addNode(a);
        myLinkedList.traverse();

        myLinkedList.removeAfter(b);
        myLinkedList.traverse();
    }
}
