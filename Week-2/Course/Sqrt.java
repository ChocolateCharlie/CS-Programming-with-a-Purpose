/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/13/2019
 **************************************************************************** */

public class Sqrt {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double EPS = 1E-15;
        double t = c;

        // Newton-Raphson method to compute sqrt(c)
        while (Math.abs(t - c / t) > t * EPS)
            t = (c / t + t) / 2.0;

        System.out.println(t);
    }
}
