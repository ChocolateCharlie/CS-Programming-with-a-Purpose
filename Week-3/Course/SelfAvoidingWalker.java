/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/21/2019
 **************************************************************************** */

public class SelfAvoidingWalker {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnds = 0;

        for (int i = 0; i < trials; i++) {
            boolean[][] city = new boolean[N][N];
            int x = N / 2, y = N / 2;

            while (x > 0 && x < N - 1 && y > 0 && y < N - 1) {
                if (city[x - 1][y] && city[x + 1][y] && city[x][y - 1] && city[x][y + 1]) {
                    deadEnds++;
                    break;
                }
                city[x][y] = true;

                double r = Math.random();
                if (r < 0.25 && !city[x + 1][y])
                    x++;
                else if (r < 0.5 && !city[x - 1][y])
                    x--;
                else if (r < 0.75 && !city[x][y + 1])
                    y++;
                else if (r < 1.00 && !city[x][y - 1])
                    y--;
            }
        }

        System.out.println(100 * deadEnds / trials + "% dead ends");
    }
}
