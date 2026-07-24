package Arrays;

public class WeightSort {
    private static int getRoot(int x) {
        if (x < 2) return x;

        long left = 1;
        long right = x / 2;
        long ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) ans;
    }

    static int getWeight(int num) {
        int root = getRoot(num);

        if (root * root == num) return 5;

        if (num % 4 == 0) return 4;

        if (num % 2 == 0) return 3;

        else return 0;
    }

    static void sortByWeight(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (getWeight(arr[j]) > getWeight(arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * <p><89,0> <10,3> <54,3> <12,4> <36,5> </p>
     *
     */
    public static void main(String[] args) {
        int[] arr = {10, 36, 54, 89, 12};

        sortByWeight(arr);

        for (int num : arr) {
            System.out.print("<" + num + "," + getWeight(num) + "> ");
        }
    }
}
