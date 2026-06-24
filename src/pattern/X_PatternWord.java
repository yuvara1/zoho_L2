package pattern;

public class X_PatternWord {
    private static void print(String word) {

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                // when i == j is equal that means it is point veritcally order.
                // when i + j == word.length() - 1 is equal that means it is point horizontally order.
                if (i == j || i + j == word.length() - 1)
                    System.out.print(word.charAt(i));
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void main(String[] args) {
        print("PROGRAM");
        print("JAVAC");
    }
}
