/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/14/2019
 **************************************************************************** */

public class RamanujansTaxi {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int a, b, c, d;

        for (int i = 1; i < n; i++) {
            a = i * i * i;
            if (a > n) break;
            for (int j = i + 1; j < n; j++) {
                b = j * j * j;
                if (b > n) break;
                for (int k = i + 1; k < n; k++) {
                    c = k * k * k;
                    if (c > n) break;
                    for (int l = k + 1; l < n; l++) {
                        d = l * l * l;
                        if (d > n) break;
                        if (a + b == c + d) {
                            System.out.print(a + b + " = ");
                            System.out.print(i + "^3 + " + j + "^3 = ");
                            System.out.println(k + "^3 + " + l + "^3");
                        }
                    }
                }

            }
        }
    }
}
