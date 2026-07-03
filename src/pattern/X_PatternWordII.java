package pattern;

public class X_PatternWordII {
    private static void print(String word) {
        int n = word.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // i) when i == j is equal that means it is point veritcally order.
                // ii) when i + j == word.length() - 1 is equal that means it is point horizontally order.
                if (i == j || i + j == n - 1) {
                    // print the character at index j instead of i, if we use i means it print the same character in the same row.
                    System.out.print(word.charAt(j));
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * <pre>
     * P     M
     *  R   A
     *   O R
     *    G
     *   O R
     *  R   A
     * P     M
     * </pre>
     *
     */
    static void main(String[] args) {
        print("PROGRAM");
        print("JAVAC");
    }
}
