package matrix;

public class RemoveDuplicateRows {
    public static void removeDuplicateRows(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;


        for (int i = 0; i < n; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                int count = 0;
                for (int k = 0; k < m; k++) {
                    if (grid[i][k] == grid[j][k]) {
                        count++;
                    }
                }
                if (count == m) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                for (int k = 0; k < m; k++) {
                    System.out.print(grid[i][k] + " ");
                }
                System.out.println();
            }
        }
    }

    /**
     * <pre>
     * 1 0 1
     * 1 1 0
     * 1 1 1
     * </pre>
     */
    public static void main(String[] args) {
        int[][] grid = {
                {1, 0, 1},
                {1, 1, 0},
                {1, 1, 1},
                {1, 0, 1}
        };
        removeDuplicateRows(grid);
    }
}
