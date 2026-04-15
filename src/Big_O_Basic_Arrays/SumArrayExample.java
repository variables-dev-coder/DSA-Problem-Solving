package Big_O_Basic_Arrays;

public class SumArrayExample {
    public static void main(String[] args) {

        int[] arr = {4, 7, 1, 9, 3};

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of elements: " + sum);
    }
}
