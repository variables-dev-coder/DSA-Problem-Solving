package Big_O_Basic_Arrays;

public class PositiveNegativeCount {

    public static void main(String[] args) {

        int[] nums = {-1,2,-3,4,0,5};

        int positiveCount = 0;

        int negativeCount = 0;

        for (int num : nums) {

            // Positive number
            if (num > 0) {

                positiveCount++;
            }

            // Negative number
            else if (num < 0) {

                negativeCount++;
            }
        }

        System.out.println(
                "Positive Count: "
                        + positiveCount);

        System.out.println(
                "Negative Count: "
                        + negativeCount);
    }
}
