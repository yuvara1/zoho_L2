package matrix;

public class WordSearch {
    public static boolean wordSearch(char[][] grid, String word) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // First character should match
                if (grid[i][j] == word.charAt(0)) {
                    // Check right
                    if (checkRight(grid, word, i, j)) {
                        return true;
                    }
                    // Check down
                    if (checkDown(grid, word, i, j)) {
                        return true;
                    }
                    // Check diagonal
                    if (checkDiagonal(grid, word, i, j)) {
                        return true;
                    }
                }
            }
        }
        return false; // Word not found in any direction
    }

    public static boolean checkRight(char[][] grid, String word, int row, int col) {
        if (col + word.length() > grid[0].length) {
            return false; // Out of bounds
        }
        for (int j = 0; j < word.length(); j++) {
            if (grid[row][col + j] != word.charAt(j)) {
                return false; // Character mismatch
            }
        }
        return true; // All characters match
    }

    public static boolean checkDown(char[][] grid, String word, int row, int col) {
        if (row + word.length() > grid.length) {
            return false; // Out of bounds
        }
        for (int j = 0; j < word.length(); j++) {
            if (grid[row + j][col] != word.charAt(j)) {
                return false; // Character mismatch
            }
        }
        return true; // All characters match
    }

    public static boolean checkDiagonal(char[][] grid, String word, int row, int col) {
        if (row + word.length() > grid.length ||
                col + word.length() > grid[0].length) {
            return false; // Out of bounds
        }
        for (int j = 0; j < word.length(); j++) {
            if (grid[row + j][col + j] != word.charAt(j)) {
                return false; // Character mismatch
            }
        }
        return true; // All characters match
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'a', 'z', 'o', 'l'},
                {'n', 'x', 'h', 'o'},
                {'v', 'y', 'i', 'v'},
                {'o', 'r', 's', 'e'}
        };
        String[] words = {"zoho", "love", "is"};

        for (String word : words) {
            if (wordSearch(grid, word)) {
                System.out.println("Word '" + word + "' found in the grid.");
            } else {
                System.out.println("Word '" + word + "' NOT found in the grid.");
            }
        }
    }
}
