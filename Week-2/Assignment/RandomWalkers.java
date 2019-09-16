/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/16/2019
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double avgSteps = 0;

        for (int i = 0; i < trials; i++) {
            int steps = 0;
            int x = 0;
            int y = 0;
            int d = 0;
            double n;

            while (d != r) {
                n = Math.random();
                if (n <= 0.25)
                    x++;
                else if (n <= 0.5)
                    x--;
                else if (n <= 0.75)
                    y++;
                else
                    y--;
                d = Math.abs(x) + Math.abs(y);
                steps++;
            }

            avgSteps += steps;
        }

        System.out.println("average number of steps = " + avgSteps / trials);
    }
}
