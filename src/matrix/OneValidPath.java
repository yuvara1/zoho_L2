package matrix;

public class OneValidPath {
    public static boolean findPath(int[][] grid, int row, int col) {
        int n = grid.length;

        // check if it is invalid cell
        if (row < 0 || col < 0 || row >= n || col >= n || grid[row][col] != 1) {
            return false;
        }
        // mark the current cell as part of the path
        grid[row][col] = 2;

        // Destination reached
        if (row == n - 1 & col == n - 1)
            return true;

        if (findPath(grid, row + 1, col)
                || findPath(grid, row, col + 1)) {
            return true;
        }
        grid[row][col] = 1; // backtrack
        return false;
    }

    private static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            for (int cell : row)
                if (cell == 2)
                    System.out.print("_ ");
                else
                    System.out.print(cell + " ");
            System.out.println();
        }
    }

    /**
     * <pre>
     * _ 1 0 0
     * _ 0 0 1
     * _ _ _ _
     * 0 0 0 _
     * </pre>
     *
     */
    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 1},
        };
        if (findPath(grid, 0, 0)) {
            printGrid(grid);
        } else {
            System.out.println("No path exists");
        }
    }
}
