package pattern;

public class All_N_bitsGeneration {

    /**
     * Recursively generates and prints all binary strings of a specified length.
     * * This method uses a depth-first search (DFS) approach to build the string
     * one bit at a time. It branches into two recursive calls at each step:
     * one appending "0" and the other appending "1".
     *
     * @param str The current binary string prefix being built.
     * @param n   The target length of the binary strings to be generated.
     */
    static void generate(String str, int n) {
        // Base case: If the current string reaches the target length, print it and backtrack.
        if (str.length() == n) {
            System.out.println(str);
            return;
        }

        // Recursive step: Append "0" and explore that branch.
        generate(str + "0", n);

        // Recursive step: Append "1" and explore that branch.
        generate(str + "1", n);
    }


    public static void main(String[] args) {
        // Generates all 2-bit binary strings: 00, 01, 10, 11
        generate("", 2);
    }
}