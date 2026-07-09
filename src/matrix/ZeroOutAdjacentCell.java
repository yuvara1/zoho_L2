package matrix;

public class ZeroOutAdjacentCell {
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // avoid using String.repeat to keep compatibility with older Java versions
        System.out.println("----------------------------------------");
    }

    public static void printZeroOutAdjacentCells(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 1) {
                    // CHECK: Does this cell have all 4 neighbors?
                    // It must NOT be on any edge.
                    if (i > 0 && i < row - 1 && j > 0 && j < col - 1) {
                        matrix[i - 1][j] = 0;
                        matrix[i + 1][j] = 0;
                        matrix[i][j - 1] = 0;
                        matrix[i][j + 1] = 0;
                    }
                }

            }
        }
        printMatrix(matrix);
    }

    /**
     * <pre>
     * 0 0 0
     * 0 0 0
     * 1 0 1
     * </pre>
     *
     */
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 1, 1}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        printZeroOutAdjacentCells(matrix);

    }
}
