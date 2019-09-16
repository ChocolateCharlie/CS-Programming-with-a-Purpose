/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/13/2019
 **************************************************************************** */

public class RelativelyPrime {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k;
        int d;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                d = 1;
                k = 1;

                while (k == 1 && d <= Math.min(i, j)) {
                    if (i % d == 0 && j % d == 0)
                        k = d;
                    d++;
                }

                if (k == 1)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
