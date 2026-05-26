package Big_O_Basic_Arrays;

public class MinElement {

    public static void main(String[] args) {

        int[] arr = {7, 2, 9, 1, 5};

        int min = arr[0];

        for (int num : arr) {

            if (num < min) {
                min = num;
            }
        }

        System.out.println("Minimum = " + min);
    }
}
