/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/7/2019
 **************************************************************************** */

public class UniformRandomNumbers {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        double avg = (a + b + c + d + e) / 5.0;
        double min = Math.min(Math.min(Math.min(a, b), Math.min(c, d)), e);
        double max = Math.max(Math.max(Math.max(a, b), Math.max(c, d)), e);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(avg);
        System.out.println(min);
        System.out.println(max);
    }
}
