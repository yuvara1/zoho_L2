package matrix;

public class WordSearchII {
    public static boolean search(char[][] grid, String word, int row, int col, int index) {
        if (index == word.length()) {
            return true; // All characters matched
        }
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return false; // Out of bounds
        }
        if (grid[row][col] != word.charAt(index)) {
            return false; // Character mismatch
        }
        return search(grid, word, row, col + 1, index + 1) || // Right
                search(grid, word, row + 1, col, index + 1); // Down
    }

    public static boolean exists(char[][] grid, String word) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (search(grid, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'a', 'z', 'o', 'l'},
                {'n', 'x', 'h', 'o'},
                {'v', 'y', 'i', 'v'},
                {'o', 'r', 's', 'e'}
        };
        String[] dict = {"van", "zoho", "love", "are", "is"};

        for (String word : dict) {
            if (exists(grid, word)) {
                System.out.println(word);
            }
        }
    }
}
