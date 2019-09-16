/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/16/2019
 **************************************************************************** */

public class TwoDRandomWalk {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int d = 0;
        int ns = 0;
        int ew = 0;
        double r;

        while (Math.abs(ns) != n / 2 && Math.abs(ew) != n / 2) {
            r = Math.random();
            if (r <= 0.25)
                ns++;
            else if (r <= 0.5)
                ns--;
            else if (r <= 0.75)
                ew++;
            else
                ew--;
            d++;
        }

        System.out.println(d);
    }
}
