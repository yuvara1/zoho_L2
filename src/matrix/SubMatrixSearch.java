package matrix;

public class SubMatrixSearch {

    // Check whether small matrix exists inside big matrix
    static boolean isSubMatrix(int[][] big, int[][] small) {

        int n = big.length;      // Size of big matrix
        int m = small.length;    // Size of small matrix

        // Try every possible starting position
        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j <= n - m; j++) {

                boolean match = true;

                // Compare all elements
                for (int x = 0; x < m; x++) {
                    for (int y = 0; y < m; y++) {

                        if (big[i + x][j + y] != small[x][y]) {
                            match = false;
                            break;
                        }
                    }

                    if (!match)
                        break;
                }

                if (match)
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] big = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] small = {
                {5, 6},
                {8, 9}
        };

        if (isSubMatrix(big, small))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
