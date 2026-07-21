package Arrays;

public class NextGreaterElementII {

    private static int[] nextGreaterElement(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            result[i] = -1;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {6, 3, 9, 10, 8, 2, 1, 15, 7};

        int[] result = nextGreaterElement(arr);

        for (int num : result)
            System.out.print(num + " ");
    }
}