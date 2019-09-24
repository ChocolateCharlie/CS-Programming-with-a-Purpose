/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/21/2019
 **************************************************************************** */

public class FindADuplicate {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int sum = 0;
        int expect = 0;

        // Calculate the expected sum of the numbers in the array
        if (N % 2 == 0)
            expect = (N + 1) * (N / 2);
        else
            expect = (N + 1) * (N / 2) + (N + 1) / 2;

        // Calculate the sum of the numbers in the array
        // Assume all given numbers are between 1 and N
        for (int i = 0; i < N; i++)
            sum += Integer.parseInt(args[i + 1]);

        if (sum == expect)
            System.out.println("No duplicate value.");
        else
            System.out.println("Array contains duplicate value.");
    }
}
