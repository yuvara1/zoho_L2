package pattern;

public class DiamondSpiralPrinting {
    static void printDiamondSpiralPattern(int n) {
        int max = (n + 1) / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int top = i;
                int left = j;
                int right = n - 1 - j;
                int bottom = n - 1 - i;

                int layer = Math.min(
                        Math.min(top, bottom),
                        Math.min(left, right)
                );

                System.out.print(max - layer);
            }
            System.out.println();
        }
    }
    /**
     * <pre>
     *     4444444
     *     4333334
     *     4322234
     *     4321234
     *     4322234
     *     4333334
     *     4444444
     * </pre>
     *
     */
    public static void main(String[] args) {
        printDiamondSpiralPattern(7);
    }
}
