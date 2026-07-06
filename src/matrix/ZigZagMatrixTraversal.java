package matrix;

public class ZigZagMatrixTraversal {
    public static void zigZagTraversalPrinting(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int d = 0; d < row + col - 1; d++) {
            if (d % 2 == 0) {
                // Bottom to Top
                int r = Math.min(d, row - 1);
                int c = d - r;

                while (r >= 0 && c < col) {
                    System.out.print(matrix[r][c] + " ");
                    r--;
                    c++;
                }
            } else {
                // Top to Bottom
                int c = Math.min(d, col - 1);
                int r = d - c;

                while (r < row && c >= 0) {
                    System.out.print(matrix[r][c] + " ");
                    r++;
                    c--;
                }
            }
        }
    }

    /**
     * <p>1 2 4 7 5 3 6 8 9 </p>
     *
     */
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        zigZagTraversalPrinting(matrix);
    }
}
