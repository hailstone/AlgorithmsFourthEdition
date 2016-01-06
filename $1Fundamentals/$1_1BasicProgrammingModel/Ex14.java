package $1Fundamentals.$1_1BasicProgrammingModel;

/**
 * Created by hailstone01 on 1/6/16.
 */
public class Ex14 {
    public static int lg(int N) {
        int result = 0;

        while (true) {
            if ((result + 1) * (result + 1) > N) {
                return result;
            }
            result++;
        }
    }

    public static void main(String[] args) {
        System.out.println(lg(22));
    }
}
