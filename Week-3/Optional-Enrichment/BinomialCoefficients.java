/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/21/2019
 **************************************************************************** */

public class BinomialCoefficients {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double[][] a = new double[N][N];

        a[0][0] = 1.0;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    a[i][j] = a[i - 1][j] / 2.0;
                else if (i == 1 && j == 1)
                    a[i][j] = 1.0 / 2.0;
                else
                    a[i][j] = (a[i - 1][j] + a[i - 1][j - 1]) / 2.0;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (a[i][j] != 0.0)
                    System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
