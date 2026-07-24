package Arrays;

import java.util.Arrays;

public class FrequencySort {
    public static int frequency(int[] arr, int value) {
        int count = 0;

        for (int num : arr)
            if (num == value)
                count++;
        return count;
    }

    public static void sortByFrequency(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (frequency(arr, arr[j]) < frequency(arr, arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5, 12, 2, 3, 3, 3, 12};
        sortByFrequency(arr);
        System.out.println("Sorted array by frequency: " + Arrays.toString(arr));
    }
}
