package matrix;

public class SubMatrixByCornerIndices {

    public static void printSubMatrixAndSum(int[][] matrix,
                                            int startRow, int startCol,
                                            int endRow, int endCol) {

        int sum = 0;

        System.out.println("Rectangle:");

        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }
            System.out.println();
        }

        System.out.println("Sum: " + sum);
    }

    /**
     * 54
     * **/
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4, 6},
                {5, 3, 8, 1, 2},
                {4, 6, 7, 5, 5},
                {2, 4, 8, 9, 4}
        };

        printSubMatrixAndSum(matrix, 2, 0, 3, 4);
    }
}