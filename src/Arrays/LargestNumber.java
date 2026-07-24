package Arrays;

public class LargestNumber {
    public static int largestNumber(int[] arr) {
        String[] str = new String[arr.length];

        // convert int to String.

        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(arr[i]);
        }

        // bubble sort
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                String s1 = str[j] + str[j + 1];
                String s2 = str[j + 1] + str[j];

                if (s1.compareTo(s2) < 0) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }

        }
        if (str[0].equals("0")) {
            return 0;
        }

        return Integer.parseInt(String.join("", str));
    }

    /**
     * 9534330
     * */
    public static void main(String[] args) {

        int[] arr = {3, 30, 34, 5, 9};
        int result = largestNumber(arr);
        System.out.println(result);

        int[] arr2 = {0, 0, 0};
        int result2 = largestNumber(arr2);
        System.out.println(result2);
    }
}
