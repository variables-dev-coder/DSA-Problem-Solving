package Big_O_Basic_Arrays;

public class MaxElement2 {

    public static void main(String[] args) {

        int[] arr = {4, 8, 2, 10, 3};

        int max = arr[0];

        for (int num : arr) {

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum = " + max);
    }
}
