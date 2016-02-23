import java.util.Arrays;

/**
 * Created by hailstone01 on 2/18/16.
 */
public class Heap {
    private int[] arr;
    private int len;

    public Heap() {
        arr = new int[]{74, 57, 56, 42, 54, 45, 47, 17, 39, 26};
        arr = Arrays.copyOf(arr, 13);
        len = 10;
        for (int i = arr.length - 1; i >= 0; i--) {
            sink(arr, i, len);
        }
        show();
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
        arr[len++] = k;
        swim(len - 1);
    }

    public void swim(int k) {
        while (k > 0) {
            if (arr[k] > arr[(k - 1) / 2]) {
                exch(k, (k - 1) / 2);
                k = (k - 1) / 2;
            } else {
                return;
            }
        }
    }

    public void show() {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(22);
        heap.insert(66);
        heap.insert(53);
        heap.show();
    }
}
