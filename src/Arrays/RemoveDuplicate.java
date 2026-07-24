package Arrays;

public class RemoveDuplicate {
    public static void removeDuplicates(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    /**
     * remove duplicates:1 2 4
     * */
    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 2, 2, 3, 4, 4, 5});
        removeDuplicates(new int[]{1, 1, 1, 1, 1});
        removeDuplicates(new int[]{1, 2, 3, 4, 5});
        removeDuplicates(new int[]{1, 2, 4, 1});
    }
}
