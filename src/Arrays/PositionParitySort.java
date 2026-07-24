package Arrays;

import java.util.Arrays;

public class PositionParitySort {

    // Ascending Bubble Sort
    static void sortAscending(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Descending Bubble Sort
    static void sortDescending(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void rearrange(int[] arr) {

        int evenSize = (arr.length + 1) / 2;
        int oddSize = arr.length / 2;

        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];

        int e = 0, o = 0;

        // Separate elements based on INDEX
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even[e++] = arr[i];
            } else {
                odd[o++] = arr[i];
            }
        }

        // Sort
        sortDescending(even, evenSize); // Even index -> Descending
        sortAscending(odd, oddSize);    // Odd index -> Ascending

        // Merge back
        e = 0;
        o = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = even[e++];
            } else {
                arr[i] = odd[o++];
            }
        }
    }

    /**
     * [9, 2, 7, 4, 5, 6, 3, 8, 1]
     * */
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rearrange(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {13, 24, 15, 12, 10, 5};
        rearrange(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {5};
        rearrange(arr3);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {9, 1};
        rearrange(arr4);
        System.out.println(Arrays.toString(arr4));
    }
}