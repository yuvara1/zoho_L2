package pattern;

public class NumberGrid {
    static void printGrid(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                // if the row is even just multiply the row with n and add col + 1
                if (row % 2 == 0)
                    System.out.print((row * n) + col + 1 + " ");

                    // if the row is odd just multiply the row with n and sub n with col (n - col)
                else System.out.print((row * n) + (n - col) + " ");
            }
            System.out.println();
        }
    }

    /**
     * <pre>
     *     1 2 3 4
     *     8 7 6 5
     *     9 10 11 12
     *     16 15 14 13
     * </pre>
     *
     */
    public static void main(String[] args) {
        printGrid(4);
    }
}
