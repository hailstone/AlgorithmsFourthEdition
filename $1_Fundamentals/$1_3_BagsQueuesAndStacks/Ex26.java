package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

/**
 * Created by hailstone01 on 1/13/16.
 */
public class Ex26 {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.add("bb");
        myLinkedList.add("aa");
        myLinkedList.add("aa");

        myLinkedList.traverse();

        myLinkedList.remove("aa");
        myLinkedList.traverse();
    }
}
