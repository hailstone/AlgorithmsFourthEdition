package $1Fundamentals.$1_1BasicProgrammingModel;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex29 {
    public static int rank(int key, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < key) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static int count(int key, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (key < arr[i]) {
                break;
            }
            if (key == arr[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 6, 7, 8, 9, 9, 9};
        int key = 5;
        System.out.println(rank(key, arr));
        System.out.println(count(key, arr));
    }
}
