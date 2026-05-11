package Big_O_Basic_Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = {3,0,1};

        int n = nums.length;

        // Expected sum
        int expectedSum =
                n * (n + 1) / 2;

        // Actual sum
        int actualSum = 0;

        for (int num : nums) {

            actualSum += num;
        }

        int missing =
                expectedSum - actualSum;

        System.out.println(
                "Missing Number: " + missing);
    }
}
