package Arrays;

public class MaximumSumContiguousSubarrayNoNegative {
    public static int maxSumSubarrayNoNegative(int[] arr) {
        int currentSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                currentSum += arr[i];
                maxSum = Math.max(maxSum, currentSum);
            } else {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 7, 5, -1, 3, 2, 9, -7};
        System.out.println("Maximum Sum of Contiguous Subarray with No Negative Numbers: " + maxSumSubarrayNoNegative(arr));
    }
}
