package Arrays;

public class EquilibriumElement {

    public static int findEquilibriumElement(int[] arr) {

        int totalSum = 0;

        // Calculate total sum
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        // Find equilibrium element
        for (int i = 0; i < arr.length; i++) {

            totalSum -= arr[i]; // Right sum

            if (leftSum == totalSum) {
                return arr[i];
            }

            leftSum += arr[i];
        }

        return -1; // No equilibrium element
    }

    /**
     * Equilibrium Element: 7
     * */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 6};

        int result = findEquilibriumElement(arr);

        if (result != -1) {
            System.out.println("Equilibrium Element: " + result);
        } else {
            System.out.println("No Equilibrium Element");
        }
    }
}