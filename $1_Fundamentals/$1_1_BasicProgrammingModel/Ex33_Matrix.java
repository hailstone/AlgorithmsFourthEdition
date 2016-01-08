package $1_Fundamentals.$1_1_BasicProgrammingModel;

/**
 * Created by hailstone01 on 1/7/16.
 */
public class Ex33_Matrix {
    public static double dot(double[] x, double[] y) throws Exception {
        double result = 0;
        if (x.length != y.length) {
            throw new Exception("x and y should have the same length");
        }

        for (int i = 0; i < x.length; i++) {
            result += x[i] * y[i];
        }

        return result;
    }

//    public double[][] mult(double[][] a, double[][] b) {
//
//    }
//
//    public static double[][] transpose(double[][] a) {
//
//    }
//
//    public static double[] mult(double[][] a, double[] x) {
//
//    }
//
//    public static double[] mult(double[] y, double[][] a) {
//
//    }

    public static void print(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(dot(new double[]{4, 6, 7}, new double[]{8, 2, 3}));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
