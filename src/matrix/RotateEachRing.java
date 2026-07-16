package matrix;

public class RotateEachRing {

    // Swaps the current matrix element with prev and returns the old value.
    private static int swap(int[][] mat, int row, int col, int prev) {
        int temp = mat[row][col];
        mat[row][col] = prev;
        return temp;
    }

    public static void rotateRings(int[][] mat) {

        int n = mat.length;

        // Process each ring
        for (int ring = 0; ring < n / 2; ring++) {

            int top = ring;
            int left = ring;
            int bottom = n - 1 - ring;
            int right = n - 1 - ring;

            int prev = mat[top][left];

            // Left Column (Top -> Bottom)
            for (int i = top + 1; i <= bottom; i++) {
                prev = swap(mat, i, left, prev);
            }

            // Bottom Row (Left -> Right)
            for (int j = left + 1; j <= right; j++) {
                prev = swap(mat, bottom, j, prev);
            }

            // Right Column (Bottom -> Top)
            for (int i = bottom - 1; i >= top; i--) {
                prev = swap(mat, i, right, prev);
            }

            // Top Row (Right -> Left)
            for (int j = right - 1; j >= left; j--) {
                prev = swap(mat, top, j, prev);
            }
        }
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Original Matrix:");
        printMatrix(mat);

        rotateRings(mat);

        System.out.println("\nAfter Rotating Each Ring:");
        printMatrix(mat);
    }
}