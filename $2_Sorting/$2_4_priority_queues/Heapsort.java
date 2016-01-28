package $2_Sorting.$2_4_priority_queues;

/**
 * Created by hailstone01 on 1/28/16.
 */
public class Heapsort {
    public static void sort(double[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            sink(a, i, a.length);
        }

        for (int i = a.length - 1; i > 0; i--) {
            exch(a, 0, i);
            sink(a, 0, i);
        }
    }

    public static void sink(double[] a, int i, int length) {
        while(2 * i + 1 < length) {
            int j = 2 * i + 1;
            if (2 * i + 2 < length && a[j] < a[j + 1]) {
                j++;
            }

            if (a[i] < a[j]) {
                exch(a, i, j);
                i = j;
            } else {
                return;
            }
        }
    }

    private static void exch(double[] a, int i, int j) {
        double temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void show(double[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%.2f\t", a[i]);
        }
        System.out.println();
    }

    public static boolean isSorted(double[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int N = 1111;
        double[] a = new double[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random();
        }

        System.out.println("before: ");
        show(a);
        sort(a);
        System.out.println("after: ");
        show(a);
        System.out.println(isSorted(a));
    }
}
