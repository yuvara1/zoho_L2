package pattern;

public class PROGRAM_FromMiddle {
    public static void print(String s) {
        int len = s.length();
        int mid = len / 2;

        // i represents the number of characters to print on the current row
        for (int i = 1; i <= len; i++) {

            // 1. Print leading spaces
            for (int space = 1; space <= len - i; space++) {
                System.out.print(" ");
            }

            // 2. Print the characters using modulo wrap-around
            for (int j = 0; j < i; j++) {

                int index = (mid + j) % len;
                System.out.print(s.charAt(index));
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        print("PROGRAM");
    }
}