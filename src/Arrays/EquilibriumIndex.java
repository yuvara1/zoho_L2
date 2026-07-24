package Arrays;

public class EquilibriumIndex {
    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // Now totalSum is the right sum for index i

            if (leftSum == totalSum) {
                return i; // Equilibrium index found
            }

            leftSum += arr[i]; // Update left sum for next iteration
        }

        return -1; // No equilibrium index found
    }

    /**
     * Equilibrium index is: 3
     *
     */
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int equilibriumIndex = findEquilibriumIndex(arr);
        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium index is: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium index found.");
        }

        int[] arr2 = {1, 2, 3};
        int equilibriumIndex2 = findEquilibriumIndex(arr2);
        if (equilibriumIndex2 != -1) {
            System.out.println("Equilibrium index is: " + equilibriumIndex2);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }
}
