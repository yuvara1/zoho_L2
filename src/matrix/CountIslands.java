package matrix;

public class CountIslands {

    public static int countIslands(int[][] grid) {
        System.out.println("----".repeat(20));
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    dfs(grid, visited, i, j, rows, cols);
                    count++;
                    System.out.println("Island " + count + " found at: (" + i + ", " + j + ")");
                }
            }
        }

        return count;
    }

    private static void dfs(int[][] grid, boolean[][] visited, int r, int c, int rows, int cols) {
        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == -1 || visited[r][c]) {
//            System.out.println("Skipping cell: (" + r + ", " + c + ") - Out of bounds or water or already visited");
            return;
        }

        visited[r][c] = true;

        // Explore all 8 directions
        dfs(grid, visited, r - 1, c, rows, cols); // Up
        dfs(grid, visited, r + 1, c, rows, cols); // Down
        dfs(grid, visited, r, c - 1, rows, cols); // Left
        dfs(grid, visited, r, c + 1, rows, cols); // Right
//        dfs(grid, visited, r - 1, c - 1, rows, cols); // Up-Left
//        dfs(grid, visited, r - 1, c + 1, rows, cols); // Up-Right
//        dfs(grid, visited, r + 1, c - 1, rows, cols); // Down-Left
//        dfs(grid, visited, r + 1, c + 1, rows, cols); // Down-Right
    }

    public static void main(String[] args) {
        // zoho islands
        int[][] grid1 = {
                {1, -1, -1, 1},
                {-1, 1, -1, 1},
                {-1, -1, 1, -1},
                {-1, -1, -1, 1}
        };

        // islands leetcode 1
        int[][] grid2 = {
                {1, 1, 1, 1, -1},
                {1, 1, -1, 1, -1},
                {1, 1, -1, -1, -1},
                {-1, -1, -1, -1, -1}
        };

        // island leetcode 2
        int[][] grid3 = {
                {1, 1, -1, -1, -1},
                {1, 1, -1, -1, -1},
                {-1, -1, 1, -1, -1},
                {-1, -1, -1, 1, 1}
        };


        System.out.println("Number of islands: " + countIslands(grid1));
        System.out.println("Number of islands: " + countIslands(grid2));
        System.out.println("Number of islands: " + countIslands(grid3));
    }
}