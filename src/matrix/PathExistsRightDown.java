package matrix;

public class PathExistsRightDown {
    public static boolean pathExists(int[][] grid) {
        return dfs(grid, 0, 0);
    }

    private static boolean dfs(int[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        // out of bounds or blocked cell
        if (row >= rows || col >= cols || grid[row][col] == 0) {
            return false;
        }

        if (row == rows - 1 && col == cols - 1) {
            return true; // reached the bottom-right corner
        }
        return dfs(grid, row + 1, col) || dfs(grid, row, col + 1); // down or right

    }

    /**
     * <p>Yes</p>
     */
    public static void main(String[] args) {
        int[][] grid = {
                {1, 0, 1, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 1, 0},
                {1, 0, 1, 1, 1},
                {0, 1, 1, 0, 1}
        };
        System.out.println(pathExists(grid) ? "Yes" : "No");
    }
}
