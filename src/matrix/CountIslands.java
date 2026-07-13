package matrix;

public class CountIslands {

    public static int countIslands(int[][] grid, boolean ignoreBorder) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int islandCount = 0;

        if (ignoreBorder) {
            // Only consider interior cells, ignoring the outer border
            for (int r = 1; r < rows - 1; r++) {
                for (int c = 1; c < cols - 1; c++) {
                    if (grid[r][c] == 1 && !visited[r][c]) {
                        dfs(grid, visited, r, c, rows, cols);
                        islandCount++;
                    }
                }
            }
            return islandCount;
        } else {
            // Consider all cells, including the border
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    if (grid[r][c] == 1 && !visited[r][c]) {
                        dfs(grid, visited, r, c, rows, cols);
                        islandCount++;
                    }
                }
            }
            return islandCount;
        }


    }

    private static void dfs(int[][] grid, boolean[][] visited, int r, int c, int rows, int cols) {
        // Stay within interior bounds only
        if (r <= 0 || r >= rows - 1 || c <= 0 || c >= cols - 1) return;
        if (visited[r][c] || grid[r][c] != 1) return;

        visited[r][c] = true;
        dfs(grid, visited, r + 1, c, rows, cols); // down
        dfs(grid, visited, r - 1, c, rows, cols); // up
        dfs(grid, visited, r, c + 1, rows, cols); // right
        dfs(grid, visited, r, c - 1, rows, cols); // left
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, -1, -1, 1},
                {-1, 1, -1, 1},
                {-1, -1, 1, -1},
                {-1, -1, -1, 1}
        };

        System.out.println("Number of islands: " + countIslands(grid, true));
        System.out.println("Number of islands (including border): " + countIslands(grid, false));
    }
}