package Big_O_Basic_Arrays;

public class AverageArray {

    public static void main(String[] args) {

        int[] nums = {2,4,6,8};

        int sum = 0;

        // Calculate sum
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
        }

        // Calculate average
        double average =
                (double) sum / nums.length;

        System.out.println(
                "Average: " + average);
    }
}
