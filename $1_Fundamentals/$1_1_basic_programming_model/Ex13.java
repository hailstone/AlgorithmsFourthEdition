package $1_fundamentals.$1_1_basic_programming_model;

/**
 * Created by hailstone01 on 1/6/16.
 */
public class Ex13 {
    public static void print(int[][] twoDim) {
        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                System.out.printf("%6d", twoDim[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] transposition(int[][] twoDim) {
        if (twoDim.length < 1) {
            System.out.println("emtpy one");
            return new int[0][0];
        }

        int[][] after = new int[twoDim[0].length][twoDim.length];

        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                after[j][i] = twoDim[i][j];
            }
        }
        return after;
    }

    public static void main(String[] args) {
        int[][] twoDim = {{2, 4, 7, 9, 1},
                {3, 5, 8, 11, 66},
                {6, 8, 22, 44, 66}};

        System.out.println("before transposition: ");
        print(twoDim);

        int[][] afterTran = transposition(twoDim);

        System.out.println("after transposition: ");
        print(afterTran);
    }
}
