/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/16/2019
 **************************************************************************** */

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        boolean isBand;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                isBand = false;
                // Check the distance to the main diagonal
                for (int k = -width; k <= width; k++) {
                    if (i + k == j)
                        isBand = true;
                }
                // Print * or 0 depending on distance to main diagonal
                if (isBand)
                    System.out.print("*  ");
                else
                    System.out.print("0  ");
            }
            System.out.println();
        }
    }
}
