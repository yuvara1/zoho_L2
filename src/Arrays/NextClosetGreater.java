package Arrays;

import java.awt.font.FontRenderContext;
import java.sql.SQLOutput;
import java.util.Arrays;

public class NextClosetGreater {
    private static int[] nextClosetGreater(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int nextGreater = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i] && arr[j] < nextGreater) {
                    nextGreater = arr[j];
                }
            }
            res[i] = (nextGreater == Integer.MAX_VALUE) ? -1 : nextGreater;
        }
        return res;
    }

    /**
     * Output: [3, 5, 8, 2, 11, 7, -1]
     * */
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 1, 8, 5, 11};
        int[] result = nextClosetGreater(arr);
        System.out.println(Arrays.toString(result));
    }
}
