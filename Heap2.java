/**
 * Created by hailstone01 on 2/18/16.
 */

/**
 * Created by hailstone01 on 2/18/16.
 */
public class Heap2 {
    private int[] arr;
    private int len;

    public Heap2() {
        arr = new int[]{99, 97, 93, 84, 71, 31, 39, 10, 22, 54};
        for (int i = arr.length - 1; i >= 0; i--) {
            sink(arr, i, arr.length);
        }
        len = 10;
    }

    public void sink(int[] arr, int i, int len) {
        while (2 * i + 1 < len) {
            int j = 2 * i + 1;
            if (j + 1 < len && arr[j + 1] > arr[j]) {
                j++;
            }

            if (arr[j] > arr[i]) {
                exch(i, j);
                i = j;
            } else {
                return;
            }
        }
    }

    public void exch(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void insert(int k) {
        if (k >= arr[0]) {
            return;
        } else {
            arr[0] = k;
            sink(arr, 0, arr.length);
        }
    }

    public void deleteMax() {
        arr[0] = arr[--len];
        sink(arr, 0, len);
    }

    public void show() {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Heap2 heap = new Heap2();
        heap.deleteMax();
        heap.deleteMax();
        heap.deleteMax();
        heap.show();
    }
}

