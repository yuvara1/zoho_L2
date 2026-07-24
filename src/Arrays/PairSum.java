package Arrays;

public class PairSum {
    public static int getCountPairSum(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
//                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
        return count;
    }

    /**
     * pair count: 2
     *
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 6};
        int target = 5;
        System.out.println(getCountPairSum(arr, target));
    }
}
