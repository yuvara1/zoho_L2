package pattern;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void printPascal(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%2d", number);

                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void printPascalLeetcode(int n) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) row.add(1);
                else {
                    List<Integer> prev = triangle.get(i - 1);
                    row.add(prev.get(j - 1) + prev.get(j));
                }
            }
            triangle.add(row);
        }

        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.printf("%2d", num);
            }
            System.out.println();
        }
    }

    /**
     * <pre>
     *       1
     *      1 1
     *     1 2 1
     *    1 3 3 1
     *   1 4 6 4 1
     * </pre>
     * */
    static void main(String[] args) {
        printPascal(5);
        System.out.println(" ---------------------------- ");
        printPascalLeetcode(5);
    }
}
