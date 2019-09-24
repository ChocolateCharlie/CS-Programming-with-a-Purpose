/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/24/2019
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] count = new int[n];

        // Run the trials
        for (int i = 0; i < trials; i++) {
            boolean[] birthdays = new boolean[n];   // n distinct birthdays
            int nb = 0;     // number of people entering the room
            int b;          // birthday of the newcomer

            while (nb < n) {
                b = (int) (Math.random() * (n - 1));
                nb++;
                if (birthdays[b]) {
                    count[nb - 1]++;
                    break;
                }
                else
                    birthdays[b] = true;
            }
        }

        // Print the results of the experiment

        int sum = 0;    // Keep track of the cumulative sum of outcomes

        for (int i = 0; i < n; i++) {
            sum += count[i];
            System.out.print(i + 1 + "\t" + count[i] + "\t");
            System.out.println((double) sum / (double) trials);
            if ((double) sum / (double) trials >= 0.5)
                break;
        }
    }
}
