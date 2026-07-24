package Arrays;

import java.util.Arrays;

public class OddEvenValueSort {
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

    static void sortOddEven(int[] arr) {
        int oddCount = 0;
        int evenCount = 0;

        // count odd and even numbers
        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        int[] odd = new int[oddCount];
        int[] even = new int[evenCount];

        int o = 0, e = 0;

        // separate odd and even numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                even[e++] = num;
            } else {
                odd[o++] = num;
            }
        }

        // sort odd and even arrays
        sortAscending(odd, oddCount);
        sortDescending(even, evenCount);

        // combine sorted arrays back into original array
        int i = 0;
        for (int num : odd) {
            arr[i++] = num;
        }
        for (int num : even) {
            arr[i++] = num;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 11, 6, 2, 1, 7};

        sortOddEven(arr);
        System.out.println(Arrays.toString(arr));
    }
}
