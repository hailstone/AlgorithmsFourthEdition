package $1_fundamentals.$1_4_analysis_of_algorithms;

import java.util.ArrayList;

/**
 * Created by hailstone01 on 1/19/16.
 */
public class Ex12 {
    public static Integer[] findCommon(int[] arrM, int[] arrN) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0, j = 0; i < arrM.length && j < arrN.length; ) {
            if (arrM[i] == arrN[j]) {
                result.add(arrM[i]);
                i++;
                j++;
            } else if (arrM[i] < arrN[j]) {
                i++;
            } else {
                j++;
            }
        }

        return result.toArray(new Integer[result.size()]);
    }

    public static void main(String[] args) {
        int[] arrM = {1, 4, 5, 8, 9, 11, 13, 55};
        int[] arrN = {2, 4, 6, 8, 9, 12, 14, 16};

        Integer[] result = findCommon(arrM, arrN);

        for (int item : result) {
            System.out.println(item);
        }
    }
}
