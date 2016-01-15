package $1_Fundamentals.$1_3_BagsQueuesAndStacks;

/**
 * Created by hailstone01 on 1/15/16.
 */
public class Ex38_Queue_Array<Item> {
    Item[] arr;
    int first;
    int last;
    int size;

    public Ex38_Queue_Array() {
        arr = (Item[]) new Object[4];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(Item x) {
        if (size == 0) {
            arr[last] = x;
        } else {
            last++;
            arr[last % arr.length] = x;
        }
        size++;
    }

    public Item delete(int k) throws Exception {
        if (k > size) {
            throw new Exception("the index specified is out of bound");
        }

        if (size == 1) {
            Item result = arr[first];
            first = 0;
            last = 0;
            size--;
            return result;
        } else {
            int current = first + (size - k);
            Item result = arr[current];
            while (current < last) {
                arr[current] = arr[current + 1];
                current++;
            }
            last -= 1;
            size--;
            return result;
        }
    }

    public void traverse() {
        int current = first;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[current] + "\t");
            current++;
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Ex38_Queue_Array<String> q = new Ex38_Queue_Array<String>();
        q.insert("aa");
        q.insert("bb");
        q.insert("cc");
        q.insert("dd");
        q.traverse();

        q.delete(4);
        q.traverse();
    }
}
