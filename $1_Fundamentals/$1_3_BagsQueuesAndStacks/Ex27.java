package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

/**
 * Created by hailstone01 on 1/13/16.
 */
public class Ex27 {
    public static int max(Node<Integer> first) throws Exception {
        if (first == null) {
            throw new Exception("linked list empty");
        }

        int max = Integer.MIN_VALUE;
        while (first != null) {
            max = max > first.item ? max : first.item;
            first = first.next;
        }

        return max;
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