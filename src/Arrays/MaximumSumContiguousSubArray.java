package Arrays;

public class MaximumSumContiguousSubArray {
    private static int maxSubArray(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    private static int maxSubArrayII(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;



        for (int i = 0; i < arr.length; i++) {

            if (sum + arr[i] > 0) {
                sum += arr[i];
                max = Math.max(max, sum);
            } else {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = maxSubArray(arr);
        System.out.println("Maximum contiguous subarray sum is: " + maxSum);
        System.out.println("Maximum contiguous subarray sum is: " + maxSubArrayII(arr));
    }
}
