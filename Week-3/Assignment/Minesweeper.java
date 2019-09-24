/* *****************************************************************************
 *  Name:              Chocolate Charlie
 *  Last modified:     9/23/2019
 **************************************************************************** */

public class Minesweeper {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        int[][] grid = new int[n][m];

        // Generate the mines uniformly at random
        while (k > 0) {
            int x = (int) (Math.random() * (n * m));
            int y = 0;

            while (x >= m) {
                x -= m;
                y++;
            }

            if (grid[y][x] != -1) {
                grid[y][x] = -1;
                k--;
            }
        }

        // Print the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == -1)
                    System.out.print("*  ");
                else {
                    // Count the neighbouring mines
                    for (int a = -1; a < 2; a++) {
                        for (int b = -1; b < 2; b++) {
                            if (i + a > -1 && i + a < n && j + b > -1 && j + b < m) {
                                if (grid[i + a][j + b] == -1)
                                    grid[i][j]++;
                            }
                        }
                    }
                    System.out.print(grid[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
