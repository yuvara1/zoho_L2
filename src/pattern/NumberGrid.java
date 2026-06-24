package pattern;

public class NumberGrid {
    static void printGrid(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {

                if (row % 2 == 0)
                    System.out.print((row * n) + col + 1 + " ");
                else System.out.print((row * n) + (n - col) + " ");
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        printGrid(4);
    }
}
