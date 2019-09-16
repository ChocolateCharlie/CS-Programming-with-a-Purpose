/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/16/2019
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int steps = 0;
        int x = 0;
        int y = 0;
        int d = 0;
        double n;

        while (d != r) {
            System.out.println("(" + x + ", " + y + ")");
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
        System.out.println("(" + x + ", " + y + ")");
        System.out.println("steps = " + steps);
    }
}
