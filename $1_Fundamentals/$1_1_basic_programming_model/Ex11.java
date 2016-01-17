package $1_fundamentals.$1_1_basic_programming_model;

/**
 * Created by hailstone01 on 1/6/16.
 */
public class Ex11 {
    public static void main(String[] args) {
        boolean[][] twoDim = {{true, true, false, false},
                {true, false, false, false}, {false, false, false, true}};

        for (int i = 0; i < twoDim.length; i++) {
            if (i == 0) {
                System.out.printf("%10s", "");
                for (int k = 0; k < twoDim[0].length; k++) {
                    System.out.printf("%10d", k);
                }
                System.out.println();
            }

            for (int j = 0; j < twoDim[i].length; j++) {
                if (j == 0) {
                    System.out.printf("%10d", i);
                }

                String s = twoDim[i][j] ? "*" : "";
                System.out.printf("%10s", s);
            }
            System.out.println();
        }
    }
}
