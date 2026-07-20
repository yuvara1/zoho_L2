package matrix;

public class MatrixRotationCheck {
    static boolean isEqual(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Rotate 90 degrees clockwise
    static int[][] rotate90(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] rotated = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }

    static boolean checkRotation(int[][] a, int[][] b) {
        int[][] r90 = rotate90(a);
        if (isEqual(r90, b)) return true;

        int[][] r180 = rotate90(r90);
        if (isEqual(r180, b)) return true;

        int[][] r270 = rotate90(r180);
        if (isEqual(r270, b)) return true;

        return false;
    }

    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 4}
        };
        int[][] B = {
                {3, 1},
                {4, 2}
        };

        if (checkRotation(A, B)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
