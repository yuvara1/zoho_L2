package Arrays;

import java.util.Arrays;

public class LexicographicSort {
    public static void lexicographicSort(int[] arr) {
        // convert integers to string
        String[] str = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            str[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(str);
        System.out.println("Lexicographic Sort: " + Arrays.toString(str));
    }
    /**
     * [1, 100, 11, 2, 21, 3]
     * */
    public static void main(String[] args) {
        int[] arr = {100, 1, 11, 21, 2, 3};
        lexicographicSort(arr);
        lexicographicSort(new int[]{10, 2, 33, 4});
    }
}
