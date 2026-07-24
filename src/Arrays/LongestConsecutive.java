package Arrays;

public class LongestConsecutive {
    private static boolean isPresent(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

    public static void longestConsecutive(int[] arr) {
        int maxLength = 0;

        // find the maximum length.
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int length = 1;

            while (isPresent(arr, current + 1)) {
                current++;
                length++;
            }
            maxLength = Math.max(maxLength, length);
        }

        // print all sequences having maximum length.

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int length = 1;

            while (isPresent(arr, current + 1)) {
                current++;
                length++;
            }

            if (length == maxLength) {
                System.out.print("Sequence: ");
                for (int j = arr[i]; j <= current; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }

    /**
     * Sequence: 1 2 3 4
     * */
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 10, 7, 9, 2, 4, 6};

        longestConsecutive(arr1);

        System.out.println();

        int[] arr2 = {1, 3, 9, 7, 8, 2, 4, 6};

        longestConsecutive(arr2);
    }
}
