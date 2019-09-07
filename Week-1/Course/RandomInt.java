/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/7/2019
 **************************************************************************** */

public class RandomInt {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        double r = Math.random();
        int t = (int) (r * N);

        System.out.println(t);
    }
}
