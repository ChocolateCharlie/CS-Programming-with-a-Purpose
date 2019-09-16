/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/13/2019
 **************************************************************************** */

public class Kary {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int j = i;
        int n = 1;
        int c = 0;

        // Calculate the maximal k^x value needed
        while (i / k > 0) {
            i /= k;
            n *= k;
        }

        // Print i in base k
        while (n > 0) {
            while (j - n >= 0 && c < k - 1) {
                c++;
                j -= n;
            }
            // Heavy syntax to print letters if needed
            if (c < 10)
                System.out.print(c);
            else if (c == 10)
                System.out.print("A");
            else if (c == 11)
                System.out.print("B");
            else if (c == 12)
                System.out.print("C");
            else if (c == 13)
                System.out.print("D");
            else if (c == 14)
                System.out.print("E");
            else if (c == 15)
                System.out.print("F");
            n /= k;
            c = 0;
        }
    }
}
