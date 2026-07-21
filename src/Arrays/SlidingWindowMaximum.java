package Arrays;

public class SlidingWindowMaximum {

    static void printMaxElementWithinWindow(int[] arr, int k) {

        for (int i = 0; i <= arr.length - k; i++) {

            int max = arr[i];

            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            System.out.print(max + " ");
        }
    }

    /**
     * 5 5 5 8 8 9
     *
     */
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 1, 8, 6, 9};
        int k = 3;

        printMaxElementWithinWindow(arr, k);
    }
}