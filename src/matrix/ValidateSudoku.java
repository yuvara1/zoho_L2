package matrix;

// Some cells may be 0 (empty)

public class ValidateSudoku {

    private static boolean validateRows(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            boolean[] seen = new boolean[9];

            for (int j = 0; j < 9; j++) {
                int num = grid[i][j];

                if (num == 0)
                    continue;

                if (num < 1 || num > 9 || seen[num - 1]) {
                    return false;
                }

                seen[num - 1] = true;
            }
        }
        return true;
    }

    private static boolean validateColumns(int[][] grid) {
        // i represent the column index
        for (int i = 0; i < 9; i++) {
            boolean[] seen = new boolean[9];

            for (int j = 0; j < 9; j++) {
                int num = grid[j][i];

                if (num == 0)
                    continue;

                if (num < 1 || num > 9 || seen[num - 1]) {
                    return false;
                }

                seen[num - 1] = true;
            }
        }
        return true;
    }

    private static boolean validateSubGrids(int[][] grid) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {

                boolean[] seen = new boolean[9];

                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        int num = grid[k][l];

                        if (num == 0)
                            continue;

                        if (num < 1 || num > 9 || seen[num - 1]) {
                            return false;
                        }

                        seen[num - 1] = true;
                    }
                }
            }
        }
        return true;
    }

    private static boolean isValidSudoku(int[][] grid) {
        return validateRows(grid)
                && validateColumns(grid)
                && validateSubGrids(grid);
    }

    public static void main(String[] args) {

        int[][] validSudoku = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        int[][] invalidSudoku = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 5, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        System.out.println(
                "Valid Sudoku : " +
                        (isValidSudoku(validSudoku) ? "Valid" : "Invalid")
        );

        System.out.println(
                "Invalid Sudoku : " +
                        (isValidSudoku(invalidSudoku) ? "Valid" : "Invalid")
        );
    }
}