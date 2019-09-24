/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/21/2019
 **************************************************************************** */

public class CouponCollector {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int cards = 0;
        boolean[] found;

        for (int i = 0; i < trials; i++) {
            int distinct = 0;
            found = new boolean[M];

            while (distinct < M) {
                int r = (int) (Math.random() * M);
                cards++;
                if (!found[r]) {
                    found[r] = true;
                    distinct++;
                }
            }
        }

        System.out.println(cards / trials);
    }
}
