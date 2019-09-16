/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/14/2019
 **************************************************************************** */

public class CountingPrimes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int nbPrimes = 0;
        boolean isPrime;

        for (int i = 2; i < n; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                nbPrimes++;
        }
        System.out.println(nbPrimes);
    }
}
