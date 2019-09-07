/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/7/2019
 **************************************************************************** */

public class ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int mid = Math.min(Math.min(Math.max(a, b), Math.max(a, c)), Math.max(b, c));

        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
}
