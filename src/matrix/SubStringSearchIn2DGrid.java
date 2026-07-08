package matrix;

public class SubStringSearchIn2DGrid {
    public static void search2DSubstring(char[][] grid, String word) {
        int rows = grid.length;
        int cols = grid[0].length;

        int len = word.length();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // check if the word starts with first letter substring
                if (grid[i][j] != word.charAt(0)) {
                    continue;
                }
                // check horizontally (left to right) -->
                if (j + len <= cols) {
                    int k;
                    for (k = 0; k < len; k++) {
                        if (grid[i][j + k] != word.charAt(k)) {
                            break;
                        }
                    }

                    if (k == len) {
                        System.out.println("Start Index: (" + i + "," + j + ")");
                        System.out.println("End Index: (" + i + "," + (j + len - 1) + ")");
                    }
                }

                if (i + len <= rows) {
                    int k;
                    for (k = 0; k < len; k++) {
                        if (grid[i + k][j] != word.charAt(k)) {
                            break;
                        }
                    }

                    if (k == len) {
                        System.out.println("Start Index: (" + i + "," + j + ")");
                        System.out.println("End Index: (" + (i + len - 1) + "," + j + ")");
                    }
                }

            }

        }
    }

    /**
     * <pre>
     * Start Index: (1,2)
     * End Index: (3,2)
     * </pre>
     *
     */
    static void main(String[] args) {
        char[][] word = {
                {'w', 'e', 'l', 'c', 'o'},
                {'m', 'e', 't', 'o', 'z'},
                {'o', 'h', 'o', 'c', 'o'},
                {'r', 'p', 'o', 'r', 'a'},
                {'t', 'i', 'o', 'n', ' '}
        };
        String search = "too";
        search2DSubstring(word, search);
    }
}
