package pattern;

public class ColumnWiseDiagonalFillTriangle {
    static void printColumnWiseDiagonalFillTriangle(int n) {
        for (int row = 0; row < n; row++) {
            int start = 1;
            for (int col = 0; col < n - row; col++) {
                System.out.print((start + row) + " ");
                start = start + (n - col);
            }
            System.out.println();
        }
    }

    /**
     * <pre>
     * 1 7 12 16 19 21
     * 2 8 13 17 20
     * 3 9 14 18
     * 4 10 15
     * 5 11
     * 6
     * </pre>
     * */
    public static void main(String[] args) {
        printColumnWiseDiagonalFillTriangle(6);
    }
}
