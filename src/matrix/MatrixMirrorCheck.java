package matrix;

public class MatrixMirrorCheck {

    // Compare two matrices
    static boolean isEqual(int[][] a, int[][] b) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Horizontal Mirror (Left ↔ Right)
    static int[][] horizontalFlip(int[][] a) {
        int n = a.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][n - 1 - j] = a[i][j];
            }
        }

        return result;
    }

    // Vertical Mirror (Top ↔ Bottom)
    static int[][] verticalFlip(int[][] a) {
        int n = a.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[n - 1 - i][j] = a[i][j];
            }
        }

        return result;
    }

    // Check whether A becomes B after a mirror flip
    static boolean checkMirror(int[][] a, int[][] b) {

        int[][] horizontal = horizontalFlip(a);
        if (isEqual(horizontal, b))
            return true;

        int[][] vertical = verticalFlip(a);
        if (isEqual(vertical, b))
            return true;

        return false;
    }

    public static void main(String[] args) {

        int[][] A = {
                {1, 2},
                {3, 4}
        };

        int[][] B = {
                {2, 1},
                {4, 3}
        };

        if (checkMirror(A, B))
            System.out.println("True");
        else
            System.out.println("False");
    }
}