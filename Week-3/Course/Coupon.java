/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/21/2019
 **************************************************************************** */

public class Coupon {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int cards = 0;
        int distinct = 0;

        boolean[] found = new boolean[M];

        while (distinct < M) {
            int r = (int) (Math.random() * M);
            cards++;
            if (!found[r]) {
                found[r] = true;
                distinct++;
            }
        }

        System.out.println(cards);
    }
}
