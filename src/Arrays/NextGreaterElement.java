package Arrays;

public class NextGreaterElement {
    static void replaceNextGreatestElement(int[] mat) {
        int n = mat.length;
        int maxFromRight = mat[n - 1];
        mat[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {
            int current = mat[i];
            mat[i] = maxFromRight;
            maxFromRight = Math.max(maxFromRight, current);
        }
    }

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};
        replaceNextGreatestElement(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
