package pattern;

public class RowWiseCyclicShiftMatrix {
    static void printRowWiseCyclicShiftMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int value = (i + j - 1) % n;
//                if (value == 0)
//                    value = n;
                System.out.print((value == 0) ? n + " " : value + " ");
            }
            System.out.println();
        }
    }

    /**
     * <p>1 2 3 4 5<p/>
     * <p>2 3 4 5 1<p/>
     * <p>3 4 5 1 2<p/>
     * <p>4 5 1 2 3<p/>
     * <p>5 1 2 3 4<p/>
     */
    static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 5;
        printRowWiseCyclicShiftMatrix(n);
    }
}
