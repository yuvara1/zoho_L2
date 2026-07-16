package matrix;

public class DiagonalSum {
    private static int diagonalSum(int[][] grid) {
        int n = grid.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += grid[i][i];
//            sum += grid[i][n - 1 - i];
        }
        if (n % 2 == 1) {
            sum -= grid[n / 2][n / 2];
        }

        return sum;
    }

    /**
     * <pre>Diagonal Sum = 42</pre>
     */
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 0},
                {3, 4, 5, 6, 7, 8, 9, 6, 4, 0},
                {2, 3, 4, 5, 6, 7, 8, 9, 3, 2},
                {3, 4, 5, 6, 7, 4, 3, 2, 1, 3},
                {3, 4, 5, 6, 2, 4, 4, 2, 4, 6},
                {2, 3, 4, 6, 2, 4, 6, 2, 3, 5},
                {2, 3, 5, 6, 2, 4, 6, 2, 3, 5},
                {2, 4, 6, 2, 1, 4, 3, 3, 5, 2},
                {3, 3, 5, 2, 4, 6, 2, 1, 4, 6}
        };

        System.out.println("Diagonal Sum = " + diagonalSum(matrix));
    }
}
