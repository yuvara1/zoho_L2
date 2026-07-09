package pattern;

import static java.lang.Math.min;

public class HallowCentre {

    static void printHallowCentre(int n, int m) {

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int top = i - 1;
                int bottom = m - i;

                int left = j - 1;
                int right = n - j;

                int layer = min(
                        min(top, bottom),
                        min(left, right)
                );
                System.out.print((layer == 2 || layer == 0) ? "X " : "0 ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * <pre>
     * X X X
     * X 0 X
     * X X X
     * </pre>
     *
     */
    public static void main(String[] args) {
        printHallowCentre(3, 3);
        printHallowCentre(6, 7);

    }
}