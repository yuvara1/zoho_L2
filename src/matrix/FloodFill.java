package matrix;

/**
 * Q20: Flood Fill (MS-Paint Bucket Tool) - DFS Solution
 * <p>
 * Input: x = 4, y = 4, newColor = 3
 * Screen: 8 columns x 8 rows, pixel (4,4) = 2
 */

public class FloodFill {

    /**
     * Flood fill using Depth-First Search (Recursive)
     * Time: O(rows × cols), Space: O(rows × cols)
     */
    public static void floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image == null || image.length == 0) {
            return;
        }

        int originalColor = image[sr][sc];

        // Avoid unnecessary recursion if new color is same as original
        if (originalColor != newColor) {
            dfs(image, sr, sc, originalColor, newColor);
        }
    }

    /**
     * Recursive DFS helper function
     */
    private static void dfs(int[][] image, int row, int col,
                            int originalColor, int newColor) {
        // Base case: out of bounds
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length) {
            return;
        }

        // Base case: not the original color
        if (image[row][col] != originalColor) {
            return;
        }

        // Fill current cell
        image[row][col] = newColor;

        // Recursively fill all 4 neighbors
        dfs(image, row - 1, col, originalColor, newColor); // Up
        dfs(image, row + 1, col, originalColor, newColor); // Down
        dfs(image, row, col - 1, originalColor, newColor); // Left
        dfs(image, row, col + 1, originalColor, newColor); // Right
    }

    // ========== UTILITY METHODS ==========

    private static void printMatrixWithLabels(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.print("   ");
        for (int j = 0; j < cols; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] copyMatrix(int[][] matrix) {
        int[][] copy = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                copy[i][j] = matrix[i][j];
            }
        }
        return copy;
    }

    private static void countChanges(int[][] original, int[][] filled) {
        int changedCount = 0;


        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[0].length; j++) {
                if (original[i][j] != filled[i][j]) {
                    changedCount++;

                }
            }
        }

        System.out.println("\nTotal pixels changed: " + changedCount);
    }

    // ========== MAIN PROBLEM: 8x8 GRID ==========

    public static void main(String[] args) {
        System.out.println("========== FLOOD FILL - 8x8 GRID ==========\n");

        // Create 8x8 screen
        int[][] screen = {
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 2, 2, 1, 1, 1, 1},
                {1, 2, 2, 2, 2, 2, 1, 1},
                {1, 2, 2, 1, 2, 2, 1, 1},
                {1, 1, 2, 2, 2, 1, 1, 1},
                {1, 2, 2, 2, 2, 2, 2, 1},
                {1, 2, 1, 2, 2, 2, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1}
        };

        int x = 4;
        int y = 4;
        int newColor = 3;

        System.out.println("BEFORE FLOOD FILL:\n");
        System.out.println("Start position: (" + x + "," + y + ")");
        System.out.println("Original color: " + screen[x][y]);
        System.out.println("New color: " + newColor + "\n");
        printMatrixWithLabels(screen);

        // Make a copy
        int[][] copy = copyMatrix(screen);

        // Apply flood fill
        floodFill(copy, x, y, newColor);

        System.out.println("\n\nAFTER FLOOD FILL:\n");
        printMatrixWithLabels(copy);

        System.out.println("\n");
        countChanges(screen, copy);
    }
}