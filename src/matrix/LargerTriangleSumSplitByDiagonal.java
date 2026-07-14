package matrix;

public class LargerTriangleSumSplitByDiagonal {

    public static void findLargerTriangleSum(int[][] matrix) {

        int n = matrix.length;
        int upperSum = 0;
        int lowerSum = 0;

        // Upper Triangle (including secondary diagonal)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                upperSum += matrix[i][j];
            }
        }

        // Lower Triangle (including secondary diagonal)
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j < n; j++) {
                lowerSum += matrix[i][j];
            }
        }


        System.out.println("Larger Triangle Sum = " + Math.max(upperSum, lowerSum));
    }

    /**
     * <pre>38</pre>
     * */
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        findLargerTriangleSum(matrix);
    }
}