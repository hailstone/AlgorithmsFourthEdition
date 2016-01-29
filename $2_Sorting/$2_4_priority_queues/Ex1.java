package $2_Sorting.$2_4_priority_queues;

import java.util.Scanner;

/**
 * Created by hailstone01 on 1/28/16.
 */
public class Ex1 {
    private int size;
    private char[] arr;

    public Ex1() {
        int initialLength = 50;
        arr = new char[initialLength];
    }

    public void push(char c) {
        arr[size++] = c;
        swim(size - 1);
    }

    public char pop() {
        char result = arr[0];
        arr[0] = arr[--size];
        sink(0);
        return result;
    }

    private void sink(int index) {
        while (index * 2 + 1 < size) {
            int j = 2 * index + 1;
            if (index * 2 + 2 < size && arr[index * 2 + 2] > arr[index * 2 + 1]) {
                j++;
            }

            if (arr[index] < arr[j]) {
                exch(index, j);
            } else {
                return;
            }
        }
    }

    private void swim(int index) {
        while (index > 0 && arr[index] > arr[(index - 1) / 2]) {
            exch(index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    private void exch(int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.printf("%c\t", arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            char c = s.charAt(0);
            System.out.println("++" + c);
            if (c == '*') {
                ex1.pop();
            } else {
                ex1.push(c);
            }
        }
        ex1.show();
    }
}
