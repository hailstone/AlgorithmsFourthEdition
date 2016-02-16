package interview_questions;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by hailstone01 on 1/30/16.
 */
public class ThreeSum {
    int[] arr;

    public ThreeSum(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        ArrayList<Node> arrayList = new ArrayList<Node>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                arrayList.add(new Node(arr[i] + arr[j], arr[i], arr[j]));
            }
        }
        Collections.sort(arrayList);
        for (int i = 0; i < arr.length; i++) {
            if (arrayList.indexOf(-arr[i]) != -1) {
                System.out.println(arr[i] + " : " + arrayList.indexOf(-arr[i]));
            }
        }
    }

    private class Node implements Comparable<Node> {
        private int sum;
        private int a;
        private int b;

        public Node(int sum, int a, int b) {
            this.sum = sum;
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Node o) {
            if (o == null) {
                throw new NullPointerException();
            }

            if (this == o) {
                return 0;
            } else if (this.sum > o.sum) {
                return 1;
            } else if (this.sum < o.sum) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, 3, 5, 7, 8, -4, -6, -2};
        ThreeSum threeSum = new ThreeSum(arr);
    }
}
