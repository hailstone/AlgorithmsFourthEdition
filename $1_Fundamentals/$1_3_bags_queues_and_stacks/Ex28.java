package $1_fundamentals.$1_3_bags_queues_and_stacks;

/**
 * Created by hailstone01 on 1/13/16.
 */
public class Ex28 {
    public static int max(Node<Integer> first) throws Exception {
        if (first == null) {
            throw new Exception("linked list is empty");
        }

        if (first.next == null) {
            return first.getItem();
        }

        return first.getItem() > max(first.next) ? first.getItem() : max(first.next);
    }

    public static void main(String[] args) throws Exception {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.add(11);
        myLinkedList.add(22);
        myLinkedList.add(333);
        myLinkedList.add(44);
        myLinkedList.traverse();

        System.out.println(max(myLinkedList.getFirst()));
    }
}
