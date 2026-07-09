package pattern;

public class DiagonalSweepTriangle {
    public static void printDiagonalSweep(int n) {
        int even = 1, odd = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(odd + " ");
                    odd += 2;
                } else {
                    System.out.print(even + " ");
                    even += 2;
                }
            }
            System.out.println();
        }
    }

    /**
     * <pre>
     * 1
     * 2 4
     * 3 5 7
     * 6 8 10 12
     * 9 11 13 15 17
     * 14 16 18 20 22 24
     * </pre>
     *
     */
    public static void main(String[] args) {
        printDiagonalSweep(6);
    }
}
